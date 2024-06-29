import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class539 extends class213 {
   @OriginalMember(
      owner = "client!qj",
      name = "N",
      descriptor = "I"
   )
   private int field7360 = -1;
   @OriginalMember(
      owner = "client!qj",
      name = "H",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7372 = new String[]{method3896(method3895("j%#\u0017x")), method3896(method3895("\u007f~aU")), method3896(method3895("`a#j-")), method3896(method3895("{j{X+}jc^+C~cMl|n")), method3896(method3895("p}lPipia\\Ucdn\\vbd\u007fJ")), method3896(method3895("`a#h-")), method3896(method3895("`a#~-")), method3896(method3895("`a#v-")), method3896(method3895("`a#k-")), method3896(method3895("`a#s-")), method3896(method3895("`a#m-")), method3896(method3895("`a#i-"))};
   @OriginalMember(
      owner = "client!qj",
      name = "O",
      descriptor = "Lafa;"
   )
   public static class365 field7364 = new class365(5, 1);
   @OriginalMember(
      owner = "client!qj",
      name = "K",
      descriptor = "I"
   )
   private int field7359;
   @OriginalMember(
      owner = "client!qj",
      name = "E",
      descriptor = "I"
   )
   private int field7361;
   @OriginalMember(
      owner = "client!qj",
      name = "F",
      descriptor = "I"
   )
   public static int field7362;
   @OriginalMember(
      owner = "client!qj",
      name = "D",
      descriptor = "I"
   )
   public static int field7363;
   @OriginalMember(
      owner = "client!qj",
      name = "J",
      descriptor = "I"
   )
   public static int field7365;
   @OriginalMember(
      owner = "client!qj",
      name = "L",
      descriptor = "I"
   )
   public static int field7367;
   @OriginalMember(
      owner = "client!qj",
      name = "P",
      descriptor = "I"
   )
   public static int field7368;
   @OriginalMember(
      owner = "client!qj",
      name = "I",
      descriptor = "I"
   )
   public static int field7369;
   @OriginalMember(
      owner = "client!qj",
      name = "Q",
      descriptor = "I"
   )
   public static int field7370;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!qj",
      name = "G",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field7371;
   @OriginalMember(
      owner = "client!qj",
      name = "M",
      descriptor = "[I"
   )
   private int[] field7366;

   @OriginalMember(
      owner = "client!qj",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method3891(byte arg0) {
      try {
         if (arg0 < 66) {
            method3893(16);
         }

         field7364 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7372[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qj",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method1621(int arg0, int arg1, int arg2) {
      try {
         ++field7369;
         super.method1621(arg0, arg1, arg2);
         if (arg1 == -30173) {
            if (this.field7360 >= 0 && class375.field5272 != null) {
               int var4 = !class375.field5272.method1293(this.field7360, -5150).field5116 ? 128 : 64;
               this.field7366 = class375.field5272.method1292(var4, false, (byte)124, 1.0F, var4, this.field7360);
               this.field7361 = var4;
               this.field7359 = var4;
            }
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field7372[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qj",
      name = "a",
      descriptor = "(III[BIIII[B)V"
   )
   public static final void method3892(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
      boolean var9 = client.field4273;

      try {
         ++field7370;
         int var10 = -(arg2 >> 2);
         int var16 = -(arg2 & arg5);
         int var11 = -arg6;
         if (var9 || ~var11 > -1) {
            label84:
            do {
               int var12 = var10;
               int var10001;
               if (var9) {
                  var10001 = arg4++;
                  arg3[var10001] = (byte)(arg3[var10001] + -arg8[arg1++]);
                  int var17 = arg4++;
                  arg3[var17] = (byte)(arg3[var17] + -arg8[arg1++]);
                  int var18 = arg4++;
                  arg3[var18] = (byte)(arg3[var18] + -arg8[arg1++]);
                  int var19 = arg4++;
                  arg3[var19] = (byte)(arg3[var19] + -arg8[arg1++]);
                  var12 = var10 + 1;
               }

               while(true) {
                  while(~var12 > -1) {
                     var10001 = arg4++;
                     arg3[var10001] = (byte)(arg3[var10001] + -arg8[arg1++]);
                     var10001 = arg4++;
                     arg3[var10001] = (byte)(arg3[var10001] + -arg8[arg1++]);
                     var10001 = arg4++;
                     arg3[var10001] = (byte)(arg3[var10001] + -arg8[arg1++]);
                     var10001 = arg4++;
                     arg3[var10001] = (byte)(arg3[var10001] + -arg8[arg1++]);
                     ++var12;
                  }

                  int var13 = var16;
                  if (!var9) {
                     if (var9) {
                        var10001 = arg4++;
                        arg3[var10001] = (byte)(arg3[var10001] + -arg8[arg1++]);
                        var13 = var16 + 1;
                     }

                     while(true) {
                        while(~var13 > -1) {
                           var10001 = arg4++;
                           arg3[var10001] = (byte)(arg3[var10001] + -arg8[arg1++]);
                           ++var13;
                        }

                        arg1 += arg7;
                        arg4 += arg0;
                        if (!var9) {
                           ++var11;
                           continue label84;
                        }

                        ++var13;
                     }
                  }

                  ++var12;
               }
            } while(~var11 > -1);

         }
      } catch (RuntimeException var15) {
         throw class534.method3846(var15, field7372[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field7372[0] : field7372[1]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + (arg8 != null ? field7372[0] : field7372[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qj",
      name = "a",
      descriptor = "(IB)[[I"
   )
   public final int[][] method212(int arg0, byte arg1) {
      boolean var3 = client.field4273;

      try {
         ++field7367;
         int[][] var4 = super.field2644.method3543(-2, arg0);
         if (arg1 <= 26) {
            field7364 = null;
         }

         if (super.field2644.field6719) {
            int var5 = this.field7359 * (class392.field5515 != this.field7361 ? this.field7361 * arg0 / class392.field5515 : arg0);
            int[] var6 = var4[0];
            int[] var7 = var4[1];
            int[] var8 = var4[2];
            if (~class576.field7916 == ~this.field7359) {
               int var9 = 0;
               if (var3 || class576.field7916 > var9) {
                  do {
                     int var10 = this.field7366[var5++];
                     var8[var9] = class743.method5375(var10, 255) << 4;
                     var7[var9] = class743.method5375(65280, var10) >> 4;
                     var6[var9] = class743.method5375(4080, var10 >> 12);
                     ++var9;
                  } while(class576.field7916 > var9);
               }

               if (!var3) {
                  return var4;
               }
            }

            int var11 = 0;
            if (var3 || var11 < class576.field7916) {
               do {
                  int var12 = this.field7359 * var11 / class576.field7916;
                  int var13 = this.field7366[var5 + var12];
                  var8[var11] = class743.method5375(4080, var13 << 4);
                  var7[var11] = class743.method5375(4080, var13 >> 4);
                  var6[var11] = class743.method5375(4080, var13 >> 12);
                  ++var11;
               } while(var11 < class576.field7916);
            }
         }

         return var4;
      } catch (RuntimeException var15) {
         throw class534.method3846(var15, field7372[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qj",
      name = "<init>",
      descriptor = "()V"
   )
   public class539() {
      super(0, false);
   }

   @OriginalMember(
      owner = "client!qj",
      name = "e",
      descriptor = "(I)V"
   )
   public final void method1537(int arg0) {
      try {
         ++field7368;
         super.method1537(-127);
         this.field7366 = null;
         if (arg0 >= -57) {
            this.method212(-34, (byte)72);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7372[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qj",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method1616(int arg0) {
      try {
         if (arg0 != -1) {
            this.method212(84, (byte)-41);
         }

         ++field7363;
         return this.field7360;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7372[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qj",
      name = "a",
      descriptor = "(Lwm;II)V"
   )
   public final void method217(class594 arg0, int arg1, int arg2) {
      try {
         ++field7362;
         if (~arg2 == -1) {
            this.field7360 = arg0.method4280(-19104);
         }

         int var4 = -118 / ((68 - arg1) / 48);
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field7372[6] + (arg0 != null ? field7372[0] : field7372[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qj",
      name = "g",
      descriptor = "(I)V"
   )
   public static final void method3893(int arg0) {
      try {
         if (arg0 != 0) {
            field7364 = null;
         }

         ++field7365;

         try {
            Method var1 = (field7371 != null ? field7371 : (field7371 = method3894(field7372[3]))).getMethod(field7372[4]);
            if (var1 != null) {
               try {
                  Runtime var2 = Runtime.getRuntime();
                  Integer var3 = (Integer)var1.invoke(var2, (Object[])null);
                  class468.field6445 = var3;
               } catch (Throwable var5) {
               }
            }
         } catch (Exception var6) {
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field7372[5] + arg0 + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!qj",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method3894(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!qj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3895(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 5);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3896(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 17;
            break;
         case 1:
            var10005 = 11;
            break;
         case 2:
            var10005 = 13;
            break;
         case 3:
            var10005 = 57;
            break;
         default:
            var10005 = 5;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
