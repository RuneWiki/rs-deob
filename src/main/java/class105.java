import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class105 implements class143 {
   @OriginalMember(
      owner = "client!iv",
      name = "q",
      descriptor = "I"
   )
   private int field1261 = -1;
   @OriginalMember(
      owner = "client!iv",
      name = "d",
      descriptor = "I"
   )
   private int field1281 = 0;
   @OriginalMember(
      owner = "client!iv",
      name = "h",
      descriptor = "[Lufa;"
   )
   private class708[] field1287 = new class708[9];
   @OriginalMember(
      owner = "client!iv",
      name = "z",
      descriptor = "Lck;"
   )
   private class667 field1280;
   @OriginalMember(
      owner = "client!iv",
      name = "k",
      descriptor = "I"
   )
   private int field1270;
   @OriginalMember(
      owner = "client!iv",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1288 = new String[]{method916(method915("fS}.\u0013")), method916(method915("t\u000b}NF")), method916(method915("aP?\f")), method916(method915("fS}*\u0013")), method916(method915("fS}$\u0013")), method916(method915("fS}+\u0013")), method916(method915("fS}1\u0013")), method916(method915("fS}\u0006RaD?\tAj\r")), method916(method915("fS}&\u0013")), method916(method915("fS}\"\u0013")), method916(method915("fS}'\u0013")), method916(method915("fS}(\u0013")), method916(method915("fS}-\u0013")), method916(method915("fS})\u0013")), method916(method915("fS}/\u0013")), method916(method915("fS}%\u0013")), method916(method915("fS}!\u0013")), method916(method915("fS}#\u0013")), method916(method915("fS}0\u0013")), method916(method915("fS}2\u0013")), method916(method915("fS},\u0013")), method916(method915("fS}\\RaL'^\u0013"))};
   @OriginalMember(
      owner = "client!iv",
      name = "t",
      descriptor = "Lsda;"
   )
   public static class269 field1282 = new class269(21, 4);
   @OriginalMember(
      owner = "client!iv",
      name = "s",
      descriptor = "I"
   )
   public static int field1262;
   @OriginalMember(
      owner = "client!iv",
      name = "j",
      descriptor = "I"
   )
   public static int field1263;
   @OriginalMember(
      owner = "client!iv",
      name = "g",
      descriptor = "I"
   )
   private int field1264;
   @OriginalMember(
      owner = "client!iv",
      name = "n",
      descriptor = "I"
   )
   public static int field1265;
   @OriginalMember(
      owner = "client!iv",
      name = "l",
      descriptor = "I"
   )
   public static int field1266;
   @OriginalMember(
      owner = "client!iv",
      name = "b",
      descriptor = "I"
   )
   public static int field1267;
   @OriginalMember(
      owner = "client!iv",
      name = "x",
      descriptor = "I"
   )
   public static int field1268;
   @OriginalMember(
      owner = "client!iv",
      name = "v",
      descriptor = "I"
   )
   private int field1269;
   @OriginalMember(
      owner = "client!iv",
      name = "w",
      descriptor = "I"
   )
   private int field1271;
   @OriginalMember(
      owner = "client!iv",
      name = "e",
      descriptor = "I"
   )
   public static int field1272;
   @OriginalMember(
      owner = "client!iv",
      name = "m",
      descriptor = "I"
   )
   public static int field1273;
   @OriginalMember(
      owner = "client!iv",
      name = "p",
      descriptor = "I"
   )
   public static int field1274;
   @OriginalMember(
      owner = "client!iv",
      name = "u",
      descriptor = "I"
   )
   public static int field1275;
   @OriginalMember(
      owner = "client!iv",
      name = "a",
      descriptor = "I"
   )
   public static int field1276;
   @OriginalMember(
      owner = "client!iv",
      name = "c",
      descriptor = "I"
   )
   public static int field1277;
   @OriginalMember(
      owner = "client!iv",
      name = "A",
      descriptor = "I"
   )
   public static int field1278;
   @OriginalMember(
      owner = "client!iv",
      name = "i",
      descriptor = "I"
   )
   public static int field1279;
   @OriginalMember(
      owner = "client!iv",
      name = "o",
      descriptor = "I"
   )
   public static int field1283;
   @OriginalMember(
      owner = "client!iv",
      name = "r",
      descriptor = "I"
   )
   public static int field1284;
   @OriginalMember(
      owner = "client!iv",
      name = "y",
      descriptor = "I"
   )
   public static int field1285;
   @OriginalMember(
      owner = "client!iv",
      name = "f",
      descriptor = "I"
   )
   public static int field1286;

   @OriginalMember(
      owner = "client!iv",
      name = "e",
      descriptor = "(B)V",
      line = 7
   )
   public static void method897(byte arg0) {
      try {
         field1282 = null;
         if (arg0 > -13) {
            field1282 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field1288[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iv",
      name = "d",
      descriptor = "(B)Z",
      line = 20
   )
   public final boolean method898(byte arg0) {
      try {
         if (arg0 > -26) {
            this.field1271 = -65;
         }

         ++field1268;
         int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field1261);
         return ~var2 == -36054;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field1288[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iv",
      name = "a",
      descriptor = "(IIZIIIIII)Z",
      line = 42
   )
   public static final boolean method899(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      try {
         ++field1274;
         int var9 = class693.field10418.field6114[arg5];
         int var10 = class693.field10418.field6116[0];
         if (var9 >= 0 && ~var9 > ~class323.field4603 && ~var10 <= -1 && class178.field2197 > var10) {
            if (~arg4 <= -1 && class323.field4603 > arg4 && arg8 >= 0 && ~class178.field2197 < ~arg8) {
               int var11 = class496.method3698(arg4, arg6, arg2, class693.field10418.method3046(-11), class766.field11248, arg1, arg3, true, arg7, arg0, var10, class571.field8509, var9, arg8, class532.field7778[class693.field10418.field9010]);
               if (~var11 > -2) {
                  return false;
               } else {
                  class637.field9260 = class766.field11248[var11 + -1];
                  class639.field9316 = class571.field8509[var11 - 1];
                  class264.field3608 = false;
                  class634.method4561((byte)-73);
                  return true;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field1288[18] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iv",
      name = "finalize",
      descriptor = "()V",
      line = 71
   )
   protected final void finalize() throws Throwable {
      try {
         this.field1280.method4784(this.field1270, 6406);
         ++field1272;
         super.finalize();
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field1288[7] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iv",
      name = "a",
      descriptor = "(I)V",
      line = 80
   )
   public final void method900(int arg0) {
      try {
         ++field1278;
         OpenGL.glBindFramebufferEXT(36160, this.field1270);
         this.field1281 |= 4;
         if (arg0 != -23302) {
            this.method898((byte)109);
         }

         this.field1261 = this.method910(-26627);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1288[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iv",
      name = "a",
      descriptor = "(Lvu;III)V",
      line = 94
   )
   public final void method901(class355 arg0, int arg1, int arg2, int arg3) {
      try {
         this.method911(0, arg1, arg0, arg3, 0);
         int var5 = 95 / ((arg2 - -19) / 63);
         ++field1263;
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field1288[10] + (arg0 != null ? field1288[1] : field1288[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iv",
      name = "a",
      descriptor = "(IILdt;I)V",
      line = 105
   )
   private final void method902(int arg0, int arg1, class251 arg2, int arg3) {
      try {
         if (arg0 != -1) {
            this.field1281 = -31;
         }

         ++field1273;
         if (~this.field1261 == 0) {
            throw new RuntimeException();
         } else {
            int var5;
            label45: {
               var5 = 1 << arg3;
               if ((~var5 & this.field1269) == 0) {
                  this.field1264 = arg2.field3361;
                  this.field1271 = arg2.field3367;
                  if (client.field4530 == 0) {
                     break label45;
                  }
               }

               if (~this.field1271 != ~arg2.field3367 || ~this.field1264 != ~arg2.field3361) {
                  throw new RuntimeException();
               }
            }

            arg2.method1896(class189.field2356[arg3], arg1, false, this.field1261);
            this.field1287[arg3] = arg2;
            this.field1269 |= var5;
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field1288[0] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1288[1] : field1288[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iv",
      name = "a",
      descriptor = "(IB)V",
      line = 140
   )
   public final void method903(int arg0, byte arg1) {
      try {
         ++field1267;
         if (arg1 > -38) {
            this.method913(84, -46, (class694)null);
         }

         if (~this.field1261 == 0) {
            throw new RuntimeException();
         } else {
            OpenGL.glReadBuffer(class189.field2356[arg0]);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field1288[20] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iv",
      name = "a",
      descriptor = "(Z)V",
      line = 155
   )
   public final void method904(boolean arg0) {
      try {
         OpenGL.glBindFramebufferEXT(36008, 0);
         if (!arg0) {
            ++field1262;
            this.field1281 &= -2;
            this.field1261 = this.method910(-26627);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1288[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iv",
      name = "<init>",
      descriptor = "(Lck;)V",
      line = 371
   )
   public class105(class667 arg0) {
      try {
         if (!arg0.field9957) {
            throw new IllegalStateException("");
         } else {
            this.field1280 = arg0;
            OpenGL.glGenFramebuffersEXT(1, class302.field4301, 0);
            this.field1270 = class302.field4301[0];
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1288[21] + (arg0 != null ? field1288[1] : field1288[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iv",
      name = "c",
      descriptor = "(B)V",
      line = 172
   )
   public final void method905(byte arg0) {
      try {
         OpenGL.glBindFramebufferEXT(36009, 0);
         int var2 = -65 / ((arg0 - 57) / 63);
         ++field1279;
         this.field1281 &= -3;
         this.field1261 = this.method910(-26627);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field1288[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iv",
      name = "a",
      descriptor = "(Ldt;II)V",
      line = 184
   )
   public final void method906(class251 arg0, int arg1, int arg2) {
      try {
         ++field1276;
         if (arg2 != 1) {
            this.method900(-70);
         }

         this.method902(-1, 0, arg0, arg1);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field1288[11] + (arg0 != null ? field1288[1] : field1288[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iv",
      name = "a",
      descriptor = "(IZ)V",
      line = 196
   )
   public final void method907(int arg0, boolean arg1) {
      try {
         ++field1284;
         if (this.field1287[arg0] != null) {
            this.field1287[arg0].method117((byte)-86);
         }

         this.field1269 &= ~(1 << arg0);
         this.field1287[arg0] = null;
         if (!arg1) {
            this.method908((byte)32);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field1288[13] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iv",
      name = "b",
      descriptor = "(B)V",
      line = 212
   )
   public final void method908(byte arg0) {
      try {
         OpenGL.glBindFramebufferEXT(36008, this.field1270);
         ++field1285;
         this.field1281 |= 1;
         this.field1261 = this.method910(-26627);
         if (arg0 != 74) {
            this.method914((byte)-2);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1288[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iv",
      name = "b",
      descriptor = "(I)V",
      line = 226
   )
   public final void method909(int arg0) {
      try {
         OpenGL.glBindFramebufferEXT(36160, 0);
         ++field1275;
         this.field1281 &= -5;
         if (arg0 != 9619) {
            field1282 = null;
         }

         this.field1261 = this.method910(-26627);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1288[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iv",
      name = "c",
      descriptor = "(I)I",
      line = 239
   )
   private final int method910(int arg0) {
      try {
         ++field1277;
         if (arg0 != -26627) {
            this.method903(73, (byte)24);
         }

         if (~(4 & this.field1281) != -1) {
            return 36160;
         } else if ((2 & this.field1281) != 0) {
            return 36009;
         } else {
            return ~(1 & this.field1281) != -1 ? 36008 : -1;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1288[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iv",
      name = "a",
      descriptor = "(IILvu;II)V",
      line = 264
   )
   private final void method911(int arg0, int arg1, class355 arg2, int arg3, int arg4) {
      try {
         ++field1266;
         if (this.field1261 == -1) {
            throw new RuntimeException();
         } else {
            int var6 = 1 << arg1;
            if ((this.field1269 & ~var6) != arg0) {
               if (~this.field1271 != ~arg2.field5386 || ~this.field1264 != ~arg2.field5386) {
                  throw new RuntimeException();
               }
            } else {
               this.field1264 = arg2.field5386;
               this.field1271 = arg2.field5386;
            }

            arg2.method2771(arg4, (byte)-47, class189.field2356[arg1], arg3, this.field1261);
            this.field1287[arg1] = arg2;
            this.field1269 |= var6;
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field1288[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1288[1] : field1288[2]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iv",
      name = "a",
      descriptor = "(II)V",
      line = 295
   )
   public final void method912(int arg0, int arg1) {
      try {
         ++field1265;
         if (this.field1261 == -1) {
            throw new RuntimeException();
         } else {
            if (arg0 != -9765) {
               this.field1269 = 124;
            }

            OpenGL.glDrawBuffer(class189.field2356[arg1]);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field1288[19] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iv",
      name = "a",
      descriptor = "(IILaga;)V",
      line = 310
   )
   public final void method913(int arg0, int arg1, class694 arg2) {
      try {
         ++field1283;
         if (~this.field1261 == 0) {
            throw new RuntimeException();
         } else {
            int var4 = 1 << arg0;
            if (~(this.field1269 & ~var4) != -1) {
               if (~this.field1271 != ~arg2.field10420 || this.field1264 != arg2.field10435) {
                  throw new RuntimeException();
               }
            } else {
               this.field1264 = arg2.field10435;
               this.field1271 = arg2.field10420;
            }

            arg2.method5040(class189.field2356[arg0], (byte)20, this.field1261);
            this.field1287[arg0] = arg2;
            this.field1269 |= var4;
            int var5 = -5 % ((-87 - arg1) / 36);
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field1288[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1288[1] : field1288[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iv",
      name = "a",
      descriptor = "(B)V",
      line = 351
   )
   public final void method914(byte arg0) {
      try {
         if (arg0 >= -4) {
            method897((byte)-118);
         }

         OpenGL.glBindFramebufferEXT(36009, this.field1270);
         ++field1286;
         this.field1281 |= 2;
         this.field1261 = this.method910(-26627);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1288[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method915(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 59);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!iv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method916(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 15;
            break;
         case 1:
            var10005 = 37;
            break;
         case 2:
            var10005 = 83;
            break;
         case 3:
            var10005 = 96;
            break;
         default:
            var10005 = 59;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
