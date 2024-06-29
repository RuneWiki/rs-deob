import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class402 implements Runnable {
   @OriginalMember(
      owner = "client!es",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6181 = new String[]{method3091(method3090("r\"?\u0016\u0017")), method3091(method3090("r\"? Jyy")), method3091(method3090("l\u007f?|B")), method3091(method3090("r\"?\u0017\u0017")), method3091(method3090("y$}>")), method3091(method3090("\u007f%e\"\u00058~")), method3091(method3090("r\"?\u0013\u0017")), method3091(method3090("8?t%L9&bmXv<to")), method3091(method3090("r\"?\u0010\u0017"))};
   @OriginalMember(
      owner = "client!es",
      name = "h",
      descriptor = "Ldw;"
   )
   public static class748 field6170 = new class748(260);
   @OriginalMember(
      owner = "client!es",
      name = "d",
      descriptor = "[B"
   )
   public static byte[] field6179 = null;
   @OriginalMember(
      owner = "client!es",
      name = "c",
      descriptor = "I"
   )
   public static int field6172;
   @OriginalMember(
      owner = "client!es",
      name = "e",
      descriptor = "I"
   )
   public static int field6175;
   @OriginalMember(
      owner = "client!es",
      name = "a",
      descriptor = "I"
   )
   public static int field6176;
   @OriginalMember(
      owner = "client!es",
      name = "f",
      descriptor = "I"
   )
   public static int field6177;
   @OriginalMember(
      owner = "client!es",
      name = "i",
      descriptor = "Ldaa;"
   )
   private class12 field6178;
   @OriginalMember(
      owner = "client!es",
      name = "g",
      descriptor = "Ljava/lang/Thread;"
   )
   private Thread field6173;
   @OriginalMember(
      owner = "client!es",
      name = "b",
      descriptor = "Z"
   )
   private volatile boolean field6180;
   @OriginalMember(
      owner = "client!es",
      name = "k",
      descriptor = "[Lhv;"
   )
   public static class544[] field6171;
   @OriginalMember(
      owner = "client!es",
      name = "j",
      descriptor = "[Ljm;"
   )
   private class717[] field6174;

   @OriginalMember(
      owner = "client!es",
      name = "a",
      descriptor = "(I)Z",
      line = 8
   )
   public final boolean method3085(int arg0) {
      try {
         ++field6172;
         if (this.field6180) {
            return true;
         } else {
            if (this.field6178 == null) {
               try {
                  int var2 = class487.field7208 != class281.field3917 ? class478.field7106.field10414 + 7000 : 80;
                  this.field6178 = class755.field11144.method5213(new URL(field6181[5] + class478.field7106.field10410 + ":" + var2 + field6181[7] + class489.field7224.field256), 1463071632);
               } catch (MalformedURLException var4) {
                  return true;
               }
            }

            if (this.field6178 != null && this.field6178.field159 != 2) {
               if (this.field6178.field159 != 1) {
                  return false;
               } else {
                  if (this.field6173 == null) {
                     this.field6173 = new Thread(this);
                     this.field6173.start();
                  }

                  if (arg0 != 864) {
                     this.method3087(-102, 34);
                  }

                  return this.field6180;
               }
            } else {
               return true;
            }
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field6181[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!es",
      name = "a",
      descriptor = "(BLhja;)Z",
      line = 49
   )
   public static final boolean method3086(byte arg0, class426 arg1) {
      try {
         ++field6177;
         if (arg0 != 22) {
            field6170 = null;
         }

         if (arg1 == null) {
            return false;
         } else if (!arg1.field6505) {
            return false;
         } else if (!arg1.method3244(13923, class329.field4668)) {
            return false;
         } else if (class264.field3613.method5681((long)arg1.field6510, arg0 ^ -23) != null) {
            return false;
         } else {
            return class309.field4394.method5681((long)arg1.field6481, -1) == null;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6181[3] + arg0 + ',' + (arg1 != null ? field6181[2] : field6181[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!es",
      name = "a",
      descriptor = "(II)Ljm;",
      line = 80
   )
   public final class717 method3087(int arg0, int arg1) {
      try {
         ++field6176;
         if (this.field6174 != null && ~arg0 <= -1 && ~this.field6174.length < ~arg0) {
            if (arg1 != -1) {
               field6179 = null;
            }

            return this.field6174[arg0];
         } else {
            return null;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field6181[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!es",
      name = "a",
      descriptor = "(Lvs;IIIII)V",
      line = 96
   )
   public static final void method3088(class616 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var6 = true;
      int var7 = arg2;
      int var8 = arg2 + arg4;
      int var9 = arg3 - 1;
      int var10 = arg3 + arg5;

      for(int var11 = arg1; var11 <= arg1 + 1; ++var11) {
         if (class424.field6437 != var11) {
            for(int var12 = var7; var12 <= var8; ++var12) {
               if (var12 >= 0 && var12 < class239.field3036) {
                  for(int var13 = var9; var13 <= var10; ++var13) {
                     if (var13 >= 0 && var13 < class220.field2796 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                        class72 var14 = class353.field5360[var11][var12][var13];
                        if (var14 != null) {
                           int var15 = (class377.field5711[var11].method2235(var13, 2116912585, var12) + class377.field5711[var11].method2235(var13, 2116912585, var12 + 1) + class377.field5711[var11].method2235(var13 + 1, 2116912585, var12) + class377.field5711[var11].method2235(var13 + 1, 2116912585, var12 + 1)) / 4 - (class377.field5711[arg1].method2235(arg3, 2116912585, arg2) + class377.field5711[arg1].method2235(arg3, 2116912585, arg2 + 1) + class377.field5711[arg1].method2235(arg3 + 1, 2116912585, arg2) + class377.field5711[arg1].method2235(arg3 + 1, 2116912585, arg2 + 1)) / 4;
                           class411 var16 = var14.field907;
                           class411 var17 = var14.field915;
                           if (var16 != null && var16.method19((byte)70)) {
                              arg0.method18((var12 - arg2) * class768.field11264 + (1 - arg4) * class572.field8520, class261.field3550, var15, var6, (var13 - arg3) * class768.field11264 + (1 - arg5) * class572.field8520, (byte)115, var16);
                           }

                           if (var17 != null && var17.method19((byte)70)) {
                              arg0.method18((var12 - arg2) * class768.field11264 + (1 - arg4) * class572.field8520, class261.field3550, var15, var6, (var13 - arg3) * class768.field11264 + (1 - arg5) * class572.field8520, (byte)109, var17);
                           }

                           for(class389 var18 = var14.field910; var18 != null; var18 = var18.field5942) {
                              class741 var19 = var18.field5943;
                              if (var19 != null && var19.method19((byte)70) && (var19.field10995 == var12 || var7 == var12) && (var19.field11000 == var13 || var9 == var13)) {
                                 int var20 = var19.field10990 - var19.field10995 + 1;
                                 int var21 = var19.field10992 - var19.field11000 + 1;
                                 arg0.method18((var19.field10995 - arg2) * class768.field11264 + (var20 - arg4) * class572.field8520, class261.field3550, var15, var6, (var19.field11000 - arg3) * class768.field11264 + (var21 - arg5) * class572.field8520, (byte)95, var19);
                              }
                           }
                        }
                     }
                  }
               }
            }

            --var7;
            var6 = false;
         }
      }

   }

   @OriginalMember(
      owner = "client!es",
      name = "b",
      descriptor = "(I)V",
      line = 192
   )
   public static void method3089(int arg0) {
      try {
         if (arg0 > 33) {
            field6179 = null;
            field6171 = null;
            field6170 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field6181[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!es",
      name = "run",
      descriptor = "()V",
      line = 208
   )
   public final void run() {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!es",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3090(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 63);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!es",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3091(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 23;
            break;
         case 1:
            var10005 = 81;
            break;
         case 2:
            var10005 = 17;
            break;
         case 3:
            var10005 = 82;
            break;
         default:
            var10005 = 63;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
