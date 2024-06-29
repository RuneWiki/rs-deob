import jaggl.OpenGL;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class553 extends class799 {
   @OriginalMember(
      owner = "client!ps",
      name = "D",
      descriptor = "I"
   )
   private int field8268;
   @OriginalMember(
      owner = "client!ps",
      name = "C",
      descriptor = "I"
   )
   private int field8275;
   @OriginalMember(
      owner = "client!ps",
      name = "x",
      descriptor = "I"
   )
   public int field8270;
   @OriginalMember(
      owner = "client!ps",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8276 = new String[]{method4206(method4205("v\u001aK5$")), method4206(method4205("v\u001aK3$")), method4206(method4205("C&#")), method4206(method4205("v\u001aK4$")), method4206(method4205("h\u001c\t\u001c")), method4206(method4205("}GK^q")), method4206(method4205("v\u001aKLeh\u0000\u0011N$")), method4206(method4205("l\b\u0002\u0017`")), method4206(method4205("v\u001aK1$")), method4206(method4205("l\b\u0002\u001deu\n")), method4206(method4205("u\u001eV\u0014")), method4206(method4205("l\b\u0002\u0004dc\u0006\u0017\u0011")), method4206(method4205("l\b\u0002\u0014t")), method4206(method4205("b\f\u0011\u0011ej\u001a")), method4206(method4205("n\u001eV\u0014")), method4206(method4205("l\b\u0006\u001ced")), method4206(method4205("n\u001c\u0003\u0016ag\u0007")), method4206(method4205("v\u001aK2$"))};
   @OriginalMember(
      owner = "client!ps",
      name = "E",
      descriptor = "Lsf;"
   )
   public static class475 field8273 = new class475();
   @OriginalMember(
      owner = "client!ps",
      name = "F",
      descriptor = "I"
   )
   public static int field8267;
   @OriginalMember(
      owner = "client!ps",
      name = "A",
      descriptor = "I"
   )
   public static int field8269;
   @OriginalMember(
      owner = "client!ps",
      name = "y",
      descriptor = "I"
   )
   public static int field8271;
   @OriginalMember(
      owner = "client!ps",
      name = "w",
      descriptor = "I"
   )
   public static int field8272;
   @OriginalMember(
      owner = "client!ps",
      name = "z",
      descriptor = "I"
   )
   public static int field8274;

   @OriginalMember(
      owner = "client!ps",
      name = "f",
      descriptor = "(I)Lmp;",
      line = 5
   )
   public static final class41 method4201(int arg0) {
      boolean var1 = client.field1786;

      try {
         ++field8269;
         class441 var2 = null;
         class41 var3 = new class41(class410.field6382, 0);

         try {
            class275 var4 = class498.field7578.method2433("", true, (byte)99);
            if (arg0 != 1217) {
               return null;
            }

            while(var4.field4398 == 0) {
               class697.method5128(1L, 68);
            }

            if (~var4.field4398 == -2) {
               var2 = (class441)var4.field4401;
               byte[] var5 = new byte[(int)var2.method3476((byte)-91)];
               int var6 = 0;
               if (var1 || ~var6 > ~var5.length) {
                  do {
                     int var7 = var2.method3473(var5, var5.length + -var6, var6, (byte)-92);
                     if (~var7 == 0) {
                        throw new IOException(field8276[2]);
                     }

                     var6 += var7;
                  } while(~var6 > ~var5.length);
               }

               var3 = new class41(new class354(var5), class410.field6382, 0);
            }
         } catch (Exception var10) {
         }

         try {
            if (var2 != null) {
               var2.method3477((byte)126);
            }
         } catch (Exception var9) {
         }

         return var3;
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field8276[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ps",
      name = "<init>",
      descriptor = "(Lc;II)V",
      line = 98
   )
   public class553(class652 param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ps",
      name = "<init>",
      descriptor = "(Lc;IIZ[[BI)V",
      line = 116
   )
   public class553(class652 param1, int param2, int param3, boolean param4, byte[][] param5, int param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ps",
      name = "<init>",
      descriptor = "(Lc;IIZ[[I)V",
      line = 135
   )
   public class553(class652 param1, int param2, int param3, boolean param4, int[][] param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ps",
      name = "g",
      descriptor = "(I)V",
      line = 59
   )
   public static void method4202(int arg0) {
      try {
         field8273 = null;
         if (arg0 != 32993) {
            method4201(-6);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8276[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ps",
      name = "a",
      descriptor = "(BIIII)V",
      line = 70
   )
   public final void method4203(byte arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         if (arg0 >= -27) {
            this.method4203((byte)84, -19, 118, 33, 83);
         }

         OpenGL.glFramebufferTexture2DEXT(arg3, arg4, arg1, super.field11631, arg2);
         ++field8272;
         this.field8268 = arg3;
         this.field8275 = arg4;
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field8276[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ps",
      name = "a",
      descriptor = "(B)V",
      line = 84
   )
   public final void method1683(byte arg0) {
      try {
         OpenGL.glFramebufferTexture2DEXT(this.field8268, this.field8275, 3553, 0, 0);
         ++field8267;
         this.field8275 = -1;
         this.field8268 = -1;
         if (arg0 != -117) {
            field8274 = -53;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8276[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ps",
      name = "d",
      descriptor = "(B)I",
      line = 171
   )
   public static final int method4204(byte arg0) {
      boolean var1 = client.field1786;

      try {
         ++field8271;
         if (class6.field37 == 0) {
            class63.field811.method482(new class506(field8276[15]), -94);
            if (class63.field811.method486((byte)-125).method3797(127) != 100) {
               return 1;
            }

            if (!((class506)class63.field811.method486((byte)-42)).method3931(false)) {
               class798.field11616.method5147((byte)48);
            }

            class6.field37 = 1;
         }

         if (~class6.field37 == -2) {
            class191.field2976 = class63.method487(-105);
            class63.field808.method482(new class489(class219.field3322), -87);
            class63.field812.method482(new class506(field8276[7]), -78);
            class63.field813.method482(new class506(field8276[12]), -121);
            class63.field814.method482(new class506(field8276[9]), -123);
            class63.field815.method482(new class506(field8276[10]), -96);
            class63.field816.method482(new class506(field8276[14]), -77);
            class63.field817.method482(new class506(field8276[11]), -94);
            class63.field818.method482(new class489(class385.field6069), -122);
            class63.field819.method482(new class489(class499.field7653), -116);
            class63.field820.method482(new class489(class542.field8173), -93);
            class63.field821.method482(new class489(class32.field407), -82);
            class63.field822.method482(new class489(class391.field6141), -88);
            class63.field823.method482(new class489(class734.field10945), -79);
            class63.field824.method482(new class489(class208.field3175), -99);
            class63.field825.method482(new class489(class356.field5481), -96);
            class63.field826.method482(new class489(class201.field3081), -94);
            class63.field827.method482(new class489(class500.field7657), -115);
            class63.field828.method482(new class489(class126.field1809), -120);
            class63.field829.method482(new class489(class449.field6884), -74);
            class63.field830.method482(new class489(class758.field11219), -94);
            class63.field831.method482(new class489(class633.field9156), -76);
            class63.field832.method482(new class554(class761.field11251, field8276[16]), -97);
            class63.field833.method482(new class489(class135.field1904), -113);
            class63.field834.method482(new class489(class357.field5518), -91);
            class63.field835.method482(new class489(class27.field324), -127);
            class63.field836.method482(new class711(class293.field4641, field8276[13]), -72);
            int var2 = 0;
            if (var1) {
               if (class191.field2976[var2].method486((byte)101) == null) {
                  throw new RuntimeException();
               }

               ++var2;
            }

            while(true) {
               while(~var2 > ~class191.field2976.length) {
                  if (class191.field2976[var2].method486((byte)101) == null) {
                     throw new RuntimeException();
                  }

                  ++var2;
               }

               int var3 = 0;
               class63[] var4 = class191.field2976;
               int var5 = 0;
               if (!var1) {
                  if (var1 || var4.length > var5) {
                     do {
                        class63 var6 = var4[var5];
                        int var7 = var6.method481(-22764);
                        int var8 = var6.method486((byte)122).method3797(64);
                        var3 += var7 * var8 / 100;
                        ++var5;
                     } while(var4.length > var5);
                  }

                  class57.field707 = var3;
                  class6.field37 = 2;
                  break;
               }

               ++var2;
            }
         }

         if (class191.field2976 == null) {
            return 100;
         } else {
            int var9 = 0;
            int var10 = 0;
            boolean var11 = true;
            if (arg0 < 20) {
               method4202(110);
            }

            class63[] var12 = class191.field2976;
            int var13 = 0;
            class63 var14;
            int var15;
            int var16;
            if (var1) {
               var14 = var12[var13];
               var15 = var14.method481(-22764);
               var16 = var14.method486((byte)105).method3797(109);
               var9 += var15;
               if (~var16 > -101) {
                  var11 = false;
               }

               var10 += var15 * var16 / 100;
               ++var13;
            }

            while(~var13 > ~var12.length) {
               var14 = var12[var13];
               var15 = var14.method481(-22764);
               var16 = var14.method486((byte)105).method3797(109);
               var9 += var15;
               if (~var16 > -101) {
                  var11 = false;
               }

               var10 += var15 * var16 / 100;
               ++var13;
            }

            if (var11) {
               if (!((class506)class63.field814.method486((byte)116)).method3931(false)) {
                  class798.field11616.method5144(32000);
               }

               if (!((class506)class63.field817.method486((byte)5)).method3931(false)) {
                  class715.field10718 = class798.field11616.method5152(-1);
               }

               class191.field2976 = null;
            }

            int var17 = var9 - class57.field707;
            int var18 = var10 - class57.field707;
            int var19 = var17 <= 0 ? 100 : var18 * 100 / var17;
            if (!var11 && var19 > 99) {
               var19 = 99;
            }

            return var19;
         }
      } catch (RuntimeException var21) {
         throw class482.method3757(var21, field8276[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ps",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4205(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 12);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ps",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4206(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 6;
            break;
         case 1:
            var10005 = 105;
            break;
         case 2:
            var10005 = 101;
            break;
         case 3:
            var10005 = 112;
            break;
         default:
            var10005 = 12;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
