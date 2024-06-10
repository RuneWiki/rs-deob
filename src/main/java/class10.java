import java.awt.Component;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loginapplet!d")
public class class10 {
   @OriginalMember(
      owner = "loginapplet!d",
      name = "a",
      descriptor = "I"
   )
   public static int field78 = 500;
   @OriginalMember(
      owner = "loginapplet!d",
      name = "b",
      descriptor = "I"
   )
   public static int field79 = 0;
   @OriginalMember(
      owner = "loginapplet!d",
      name = "c",
      descriptor = "I"
   )
   public static volatile int field80 = 0;
   @OriginalMember(
      owner = "loginapplet!d",
      name = "d",
      descriptor = "Lsa;"
   )
   public static class41 field81 = class8.method31(-59, "box_right_stud");
   @OriginalMember(
      owner = "loginapplet!d",
      name = "e",
      descriptor = "Lsa;"
   )
   public static class41 field82 = class8.method31(-88, "");
   @OriginalMember(
      owner = "loginapplet!d",
      name = "f",
      descriptor = "Le;"
   )
   public static class12 field83;
   @OriginalMember(
      owner = "loginapplet!d",
      name = "g",
      descriptor = "[I"
   )
   private int[] field84;

   @OriginalMember(
      owner = "loginapplet!d",
      name = "a",
      descriptor = "(II)I",
      line = 4
   )
   public static int method38(int arg0, int arg1) {
      try {
         return arg0 & arg1;
      } catch (RuntimeException var3) {
         throw class28.method139(var3, "d.A(" + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!d",
      name = "a",
      descriptor = "([Lsa;III)Lsa;",
      line = 18
   )
   public static final class41 method39(class41[] arg0, int arg1, int arg2, int arg3) {
      try {
         int var4 = 0;

         for(int var5 = 0; arg2 > var5; ++var5) {
            if (arg0[arg1 - -var5] == null) {
               arg0[arg1 + var5] = class20.field145;
            }

            var4 += arg0[var5 + arg1].field316;
         }

         byte[] var11 = new byte[var4];
         int var6 = 0;
         int var7 = 0;
         int var8 = -126 / ((arg3 - 77) / 33);

         while(arg2 > var7) {
            class41 var9 = arg0[var7 + arg1];
            class47.method227(var9.field309, 0, var11, var6, var9.field316);
            var6 += var9.field316;
            ++var7;
         }

         class41 var12 = new class41();
         var12.field316 = var4;
         var12.field309 = var11;
         return var12;
      } catch (RuntimeException var10) {
         throw class28.method139(var10, "d.I(" + (arg0 != null ? "{...}" : "null") + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!d",
      name = "a",
      descriptor = "(Lloginapplet;I)J",
      line = 67
   )
   private final long method40(loginapplet arg0, int arg1) {
      try {
         String var3 = arg0.field192;

         try {
            URL var4 = new URL(var3);
            URLConnection var5 = var4.openConnection();
            var5.setDoInput(true);
            var5.setDoOutput(true);
            OutputStreamWriter var6 = new OutputStreamWriter(var5.getOutputStream());
            var6.write("data1=req");
            if (arg1 != 0) {
               this.method41(65, (loginapplet)null);
            }

            var6.flush();
            InputStream var7 = var5.getInputStream();
            class13 var8 = new class13(new byte[1000]);

            do {
               int var9 = var7.read(var8.field102, var8.field105, -var8.field105 + 1000);
               if (~var9 == 0) {
                  String var14 = new String(var8.field102);
                  if (!this.method43(var14, true)) {
                     var8.field105 = 0;
                     return var8.method73(arg1 + 991986976);
                  } else {
                     class25.field175 = 5;
                     arg0.field188 = var14;
                     return 0L;
                  }
               }

               var8.field105 += var9;
            } while(-1001 < ~var8.field105);

            class25.field175 = 4;
            return 0L;
         } catch (Exception var12) {
            class25.field175 = 4;
            return 0L;
         }
      } catch (RuntimeException var13) {
         throw class28.method139(var13, "d.E(" + (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!d",
      name = "a",
      descriptor = "(ILloginapplet;)V",
      line = 134
   )
   public final void method41(int arg0, loginapplet arg1) {
      try {
         if (arg0 == -1) {
            long var3 = this.method40(arg1, 0);
            if (var3 != 0L) {
               this.method46(0, arg1, var3);
            }

         }
      } catch (RuntimeException var5) {
         throw class28.method139(var5, "d.B(" + arg0 + ',' + (arg1 != null ? "{...}" : "null") + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!d",
      name = "a",
      descriptor = "(I)V",
      line = 154
   )
   public static final void method42(int arg0) {
      try {
         class14.field113 = null;
         class32.field205 = null;
         class9.field76 = null;
         class22.field153 = (byte[][])null;
         class9.field75 = null;
         class13.field101 = null;
         if (arg0 != -1) {
            method42(-77);
         }

      } catch (RuntimeException var2) {
         throw class28.method139(var2, "d.F(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!d",
      name = "a",
      descriptor = "(Ljava/lang/String;Z)Z",
      line = 175
   )
   private final boolean method43(String arg0, boolean arg1) {
      try {
         if (null != arg0) {
            URL var3;
            try {
               var3 = new URL(arg0);
            } catch (MalformedURLException var6) {
               return false;
            }

            String var4 = var3.getHost();
            if (!arg1) {
               this.field84 = (int[])null;
            }

            for(int var5 = 0; class44.field332.length > var5; ++var5) {
               if (var4.endsWith(class44.field332[var5])) {
                  return true;
               }
            }

            return false;
         } else {
            return false;
         }
      } catch (RuntimeException var7) {
         throw class28.method139(var7, "d.H(" + (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!d",
      name = "b",
      descriptor = "(I)V",
      line = 221
   )
   public static void method44(int arg0) {
      try {
         if (arg0 != 9901) {
            method45((byte)104, (Component)null);
         }

         field82 = null;
         field83 = null;
         field81 = null;
      } catch (RuntimeException var2) {
         throw class28.method139(var2, "d.C(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!d",
      name = "a",
      descriptor = "(BLjava/awt/Component;)V",
      line = 237
   )
   public static final void method45(byte arg0, Component arg1) {
      try {
         arg1.addMouseListener(class14.field111);
         int var2 = 102 % ((arg0 - 34) / 46);
         arg1.addMouseMotionListener(class14.field111);
         arg1.addFocusListener(class14.field111);
      } catch (RuntimeException var3) {
         throw class28.method139(var3, "d.G(" + arg0 + ',' + (arg1 != null ? "{...}" : "null") + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!d",
      name = "a",
      descriptor = "(ILloginapplet;J)V",
      line = 260
   )
   private final void method46(int arg0, loginapplet arg1, long arg2) {
      try {
         Random var5 = new Random();
         class13 var6 = new class13(128);
         class13 var7 = new class13(128);
         this.field84 = new int[4];
         this.field84[0] = var5.nextInt();
         this.field84[1] = var5.nextInt();
         this.field84[3] = (int)arg2;
         this.field84[2] = (int)(arg2 >> 1498049120);
         var6.method74(6695, 10);

         int var8;
         for(var8 = 0; -5 < ~var8; ++var8) {
            var6.method71(var5.nextInt(), 462177616);
         }

         var6.method71(this.field84[0], 462177616);
         var6.method71(this.field84[1], 462177616);
         var6.method60(106, arg2);
         var6.method60(79, class28.field194.method207(arg0 + 11405));

         for(var8 = 0; ~var8 > -5; ++var8) {
            var6.method71(var5.nextInt(), 462177616);
         }

         var6.method62(class20.field142, -75, class13.field104);
         var7.method74(arg0 + 6695, 10);

         for(var8 = 0; -4 < ~var8; ++var8) {
            var7.method71(var5.nextInt(), 462177616);
         }

         if (null != arg1.field190) {
            var7.method60(7, var5.nextLong());
            var7.method65(var5.nextLong(), (byte)-106);
         } else {
            class11.field85.method191(47, var7);
         }

         if (null != class13.field106.field273) {
            int var9;
            try {
               var8 = class13.field106.field273.method122(var7.field105, 24, 15409, var7.field102);
               if (1 <= var8) {
                  var7.field105 += 24;
               } else {
                  for(var9 = 0; var9 < 24; ++var9) {
                     var7.method74(6695, -1);
                  }
               }
            } catch (IOException var17) {
               for(var9 = 0; 24 > var9; ++var9) {
                  var7.method74(6695, -1);
               }
            }
         } else {
            for(var8 = 0; -25 < ~var8; ++var8) {
               var7.method74(6695, -1);
            }
         }

         var7.method60(117, var5.nextLong());
         var7.method62(class20.field142, -128, class13.field104);
         class13 var20 = new class13(var7.field105 + (3 - -var6.field105));
         var20.method74(6695, 1);
         var20.method74(6695, var6.field105);
         var20.method59(arg0, -115, var6.field105, var6.field102);
         var20.method74(arg0 ^ 6695, var7.field105);
         var20.method59(0, -53, var7.field105, var7.field102);
         String var19 = class16.method84(var20, 3);
         String var10 = arg1.field192;

         try {
            URL var11 = new URL(var10);
            URLConnection var12 = var11.openConnection();
            var12.setDoInput(true);
            var12.setDoOutput(true);
            OutputStreamWriter var13 = new OutputStreamWriter(var12.getOutputStream());
            var13.write("data2=" + class39.method188((byte)121, var19) + "&dest=" + class39.method188((byte)-64, arg1.field186));
            var13.flush();
            InputStream var14 = var12.getInputStream();
            var20 = new class13(new byte[1000]);

            while(true) {
               int var15 = var14.read(var20.field102, var20.field105, 1000 - var20.field105);
               if (var15 == -1) {
                  var13.close();
                  var14.close();
                  String var21 = new String(var20.field102);
                  if (var21.startsWith("OFFLINE")) {
                     class25.field175 = 3;
                  } else if (var21.startsWith("WRONG")) {
                     class25.field175 = 2;
                  } else if (!var21.startsWith("RELOAD")) {
                     if (!this.method43(var21, true)) {
                        var20.method63(-109, this.field84);

                        while(~var20.field105 < -1 && ~var20.field102[var20.field105 + -1] == -1) {
                           --var20.field105;
                        }

                        var21 = new String(var20.field102, 0, var20.field105);
                        if (this.method43(var21, true)) {
                           arg1.field188 = var21;
                           class25.field175 = 5;
                        } else {
                           class25.field175 = 4;
                        }
                     } else {
                        class25.field175 = 5;
                        arg1.field188 = var21;
                     }
                  } else {
                     class37.field271 = true;
                  }
                  break;
               }

               var20.field105 += var15;
               if (-1001 >= ~var20.field105) {
                  class25.field175 = 4;
                  return;
               }
            }
         } catch (Throwable var16) {
            var16.printStackTrace();
            class25.field175 = 4;
         }

      } catch (RuntimeException var18) {
         throw class28.method139(var18, "d.D(" + arg0 + ',' + (arg1 != null ? "{...}" : "null") + ',' + arg2 + ')');
      }
   }
}
