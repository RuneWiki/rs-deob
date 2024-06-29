import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gia")
public class class515 extends class70 {
   @OriginalMember(
      owner = "client!gia",
      name = "R",
      descriptor = "I"
   )
   private int field7173 = 2048;
   @OriginalMember(
      owner = "client!gia",
      name = "L",
      descriptor = "I"
   )
   private int field7175 = 1024;
   @OriginalMember(
      owner = "client!gia",
      name = "I",
      descriptor = "I"
   )
   private int field7180 = 3072;
   @OriginalMember(
      owner = "client!gia",
      name = "T",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7181 = new String[]{method3881(method3880("k\u0006\u000bc~$")), method3881(method3880("k\u0006\u000bc}$")), method3881(method3880("k\u0006\u000bcv$")), method3881(method3880("k\u0006\u000bcu$")), method3881(method3880("wADcG")), method3881(method3880("b\u001a\u0006!")), method3881(method3880("k\u0006\u000bcy$")), method3881(method3880("k\u0006\u000bcx$")), method3881(method3880("k\u0006\u000bc\u007f$"))};
   @OriginalMember(
      owner = "client!gia",
      name = "S",
      descriptor = "I"
   )
   public static int field7170;
   @OriginalMember(
      owner = "client!gia",
      name = "J",
      descriptor = "I"
   )
   public static int field7171;
   @OriginalMember(
      owner = "client!gia",
      name = "M",
      descriptor = "I"
   )
   public static int field7172;
   @OriginalMember(
      owner = "client!gia",
      name = "O",
      descriptor = "I"
   )
   public static int field7174;
   @OriginalMember(
      owner = "client!gia",
      name = "N",
      descriptor = "I"
   )
   public static int field7176;
   @OriginalMember(
      owner = "client!gia",
      name = "Q",
      descriptor = "I"
   )
   public static int field7177;
   @OriginalMember(
      owner = "client!gia",
      name = "K",
      descriptor = "I"
   )
   public static int field7178;
   @OriginalMember(
      owner = "client!gia",
      name = "P",
      descriptor = "I"
   )
   public static int field7179;

   @OriginalMember(
      owner = "client!gia",
      name = "<init>",
      descriptor = "()V"
   )
   public class515() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!gia",
      name = "a",
      descriptor = "(IZI)Ljava/lang/String;"
   )
   public static final String method3877(int arg0, boolean arg1, int arg2) {
      try {
         if (arg0 > -24) {
            field7178 = 118;
         }

         ++field7177;
         return arg1 && arg2 >= 0 ? class415.method3247(true, arg2, arg1, 10) : Integer.toString(arg2);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7181[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gia",
      name = "a",
      descriptor = "(BI)[I"
   )
   public final int[] method331(byte arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         ++field7176;
         if (arg0 != -63) {
            field7178 = -34;
         }

         int[] var4 = super.field940.method119(false, arg1);
         if (super.field940.field270) {
            int[] var5 = this.method690(-48, 0, arg1);
            int var6 = 0;
            if (var3 || ~class262.field3328 < ~var6) {
               do {
                  var4[var6] = this.field7175 - -(var5[var6] * this.field7173 >> 12);
                  ++var6;
               } while(~class262.field3328 < ~var6);
            }
         }

         return var4;
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field7181[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gia",
      name = "a",
      descriptor = "(II)[[I"
   )
   public final int[][] method547(int arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         ++field7170;
         int[][] var4 = super.field926.method2860(0, arg1);
         if (super.field926.field5048) {
            int[][] var5 = this.method696(arg1, 0, 32767);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int var12 = 0;
            if (var3 || var12 < class262.field3328) {
               do {
                  var9[var12] = (var6[var12] * this.field7173 >> 12) + this.field7175;
                  var10[var12] = (var7[var12] * this.field7173 >> 12) + this.field7175;
                  var11[var12] = (var8[var12] * this.field7173 >> 12) + this.field7175;
                  ++var12;
               } while(var12 < class262.field3328);
            }
         }

         return arg0 != -6752 ? null : var4;
      } catch (RuntimeException var14) {
         throw class93.method866(var14, field7181[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gia",
      name = "a",
      descriptor = "(ILgea;I)V"
   )
   public final void method550(int arg0, class66 arg1, int arg2) {
      boolean var4 = client.field1481;

      try {
         label57: {
            label51: {
               label50: {
                  ++field7174;
                  if (~arg2 != -1) {
                     if (~arg2 == -2) {
                        break label50;
                     }

                     if (~arg2 != -3) {
                        break label57;
                     }

                     if (!var4) {
                        break label51;
                     }
                  }

                  this.field7175 = arg1.method603(-2);
                  if (!var4) {
                     break label57;
                  }
               }

               this.field7180 = arg1.method603(-2);
               if (!var4) {
                  break label57;
               }
            }

            super.field930 = arg1.method640(255) == 1;
         }

         if (arg0 >= -34) {
            this.method331((byte)-114, 49);
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field7181[6] + arg0 + ',' + (arg1 != null ? field7181[4] : field7181[5]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gia",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method552(int arg0) {
      try {
         if (arg0 >= -36) {
            this.field7175 = 90;
         }

         ++field7172;
         this.field7173 = -this.field7175 + this.field7180;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7181[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gia",
      name = "a",
      descriptor = "(ILjava/lang/String;ILiu;)Ldu;"
   )
   public static final class429 method3878(int arg0, String arg1, int arg2, class530 arg3) {
      try {
         ++field7179;
         int var4 = OpenGL.glGenProgramARB();
         OpenGL.glBindProgramARB(arg0, var4);
         OpenGL.glProgramStringARB(arg0, 34933, arg1);
         OpenGL.glGetIntegerv(34379, class80.field1102, 0);
         if (~class80.field1102[0] != arg2) {
            OpenGL.glBindProgramARB(arg0, 0);
            return null;
         } else {
            OpenGL.glBindProgramARB(arg0, 0);
            return new class429(arg3, arg0, var4);
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field7181[8] + arg0 + ',' + (arg1 != null ? field7181[4] : field7181[5]) + ',' + arg2 + ',' + (arg3 != null ? field7181[4] : field7181[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gia",
      name = "a",
      descriptor = "(IIB)I"
   )
   public static final int method3879(int arg0, int arg1, byte arg2) {
      boolean var3 = client.field1481;

      try {
         if (arg2 != 73) {
            method3878(71, (String)null, -10, (class530)null);
         }

         byte var4;
         label34: {
            ++field7171;
            if (arg1 <= 20000) {
               if (~arg1 < -10001) {
                  var4 = 3;
                  class384.method3042(true);
                  if (!var3) {
                     break label34;
                  }
               }

               if (arg1 <= 5000) {
                  var4 = 1;
                  class743.method5390((byte)16, true);
                  if (!var3) {
                     break label34;
                  }
               }

               var4 = 2;
               class551.method4170(arg2 + -73);
               if (!var3) {
                  break label34;
               }
            }

            var4 = 4;
            class435.method3362((byte)90);
         }

         if (~class757.field11093.field11012.method27(-18033) != ~arg0) {
            class757.field11093.method5438(true, class757.field11093.field10997, arg0);
            class214.method1749(arg0, false, 81);
         }

         class654.method4804((byte)-94);
         return var4;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field7181[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3880(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 58);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3881(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 12;
            break;
         case 1:
            var10005 = 111;
            break;
         case 2:
            var10005 = 106;
            break;
         case 3:
            var10005 = 77;
            break;
         default:
            var10005 = 58;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
