import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class483 extends class70 {
   @OriginalMember(
      owner = "client!gt",
      name = "I",
      descriptor = "I"
   )
   private int field7350 = -1;
   @OriginalMember(
      owner = "client!gt",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7362 = new String[]{method3766(method3765("\u0003~\u0012o\u0015")), method3766(method3765("\u0003~\u0012i\u0015")), method3766(method3765("\u001f$\u0012\u000f@")), method3766(method3765("\n\u007fPM")), method3766(method3765("\u0003~\u0012k\u0015")), method3766(method3765("\u0003~\u0012d\u0015")), method3766(method3765("\u0003~\u0012`\u0015")), method3766(method3765("\u000ekJ@\u0013\bkRF\u00136\u007fRUT\to")), method3766(method3765("\u0005|]HQ\u0005hPDm\u0016e_DN\u0017eNR")), method3766(method3765("\u0003~\u0012l\u0015")), method3766(method3765("\u0003~\u0012e\u0015"))};
   @OriginalMember(
      owner = "client!gt",
      name = "K",
      descriptor = "Luk;"
   )
   public static class498 field7353 = new class498(57, 0);
   @OriginalMember(
      owner = "client!gt",
      name = "Q",
      descriptor = "J"
   )
   public static long field7358 = 0L;
   @OriginalMember(
      owner = "client!gt",
      name = "P",
      descriptor = "Luk;"
   )
   public static class498 field7355 = new class498(77, 0);
   @OriginalMember(
      owner = "client!gt",
      name = "J",
      descriptor = "I"
   )
   public static int field7359 = 5000;
   @OriginalMember(
      owner = "client!gt",
      name = "O",
      descriptor = "I"
   )
   public static int field7360 = 0;
   @OriginalMember(
      owner = "client!gt",
      name = "L",
      descriptor = "I"
   )
   public static int field7346;
   @OriginalMember(
      owner = "client!gt",
      name = "S",
      descriptor = "I"
   )
   public static int field7347;
   @OriginalMember(
      owner = "client!gt",
      name = "T",
      descriptor = "I"
   )
   public static int field7348;
   @OriginalMember(
      owner = "client!gt",
      name = "V",
      descriptor = "I"
   )
   public int field7349;
   @OriginalMember(
      owner = "client!gt",
      name = "H",
      descriptor = "I"
   )
   public static int field7351;
   @OriginalMember(
      owner = "client!gt",
      name = "R",
      descriptor = "I"
   )
   public int field7354;
   @OriginalMember(
      owner = "client!gt",
      name = "N",
      descriptor = "I"
   )
   public static int field7356;
   @OriginalMember(
      owner = "client!gt",
      name = "U",
      descriptor = "I"
   )
   public static int field7357;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!gt",
      name = "F",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field7361;
   @OriginalMember(
      owner = "client!gt",
      name = "M",
      descriptor = "[I"
   )
   public int[] field7352;

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!gt",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;",
      line = 1
   )
   public static Class method3764(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!gt",
      name = "g",
      descriptor = "(I)Z",
      line = 3
   )
   public final boolean method3761(int arg0) {
      try {
         ++field7346;
         if (arg0 != 17051) {
            this.field7354 = 15;
         }

         if (this.field7352 != null) {
            return true;
         } else if (~this.field7350 <= -1) {
            class776 var2 = ~class56.field694 > -1 ? class776.method5650(class624.field9056, this.field7350) : class776.method5639(class624.field9056, class56.field694, this.field7350);
            var2.method5644();
            this.field7352 = var2.method5641();
            this.field7354 = var2.field11394;
            this.field7349 = var2.field11395;
            return true;
         } else {
            return false;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field7362[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gt",
      name = "a",
      descriptor = "(IILica;)V",
      line = 32
   )
   public final void method274(int arg0, int arg1, class354 arg2) {
      try {
         ++field7357;
         if (arg0 != -1) {
            this.field7350 = 25;
         }

         if (arg1 == 0) {
            this.field7350 = arg2.method2848(arg0 + -96);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field7362[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7362[2] : field7362[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gt",
      name = "a",
      descriptor = "(II)[[I",
      line = 47
   )
   public int[][] method537(int arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         ++field7347;
         int[][] var4 = super.field918.method3276((byte)91, arg1);
         if (super.field918.field6361 && this.method3761(17051)) {
            label60: {
               int[] var5 = var4[0];
               int[] var6 = var4[1];
               int[] var7 = var4[2];
               int var8 = (~class304.field4744 != ~this.field7354 ? this.field7354 * arg1 / class304.field4744 : arg1) * this.field7349;
               if (~class678.field10127 != ~this.field7349) {
                  int var9 = 0;
                  if (var3 || ~var9 > ~class678.field10127) {
                     do {
                        int var10 = this.field7349 * var9 / class678.field10127;
                        int var11 = this.field7352[var8 + var10];
                        var7[var9] = class408.method3277(4080, var11 << 4);
                        var6[var9] = class408.method3277(var11, 65280) >> 4;
                        var5[var9] = class408.method3277(16711680, var11) >> 12;
                        ++var9;
                     } while(~var9 > ~class678.field10127);
                  }

                  if (!var3) {
                     break label60;
                  }
               }

               int var12 = 0;
               if (var3 || ~var12 > ~class678.field10127) {
                  do {
                     int var13 = this.field7352[var8++];
                     var7[var12] = class408.method3277(var13 << 4, 4080);
                     var6[var12] = class408.method3277(65280, var13) >> 4;
                     var5[var12] = class408.method3277(var13, 16711680) >> 12;
                     ++var12;
                  } while(~var12 > ~class678.field10127);
               }
            }
         }

         if (arg0 != 32) {
            this.method541(101);
         }

         return var4;
      } catch (RuntimeException var15) {
         throw class482.method3757(var15, field7362[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gt",
      name = "a",
      descriptor = "(B)I",
      line = 116
   )
   public final int method540(byte arg0) {
      try {
         ++field7351;
         if (arg0 != 107) {
            this.method541(27);
         }

         return this.field7350;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7362[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gt",
      name = "<init>",
      descriptor = "()V",
      line = 127
   )
   public class483() {
      super(0, false);
   }

   @OriginalMember(
      owner = "client!gt",
      name = "a",
      descriptor = "(I)V",
      line = 135
   )
   public final void method541(int arg0) {
      try {
         super.method541(-73);
         ++field7348;
         int var2 = 35 % ((7 - arg0) / 60);
         this.field7352 = null;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field7362[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gt",
      name = "b",
      descriptor = "(B)V",
      line = 147
   )
   public static final void method3762(byte arg0) {
      try {
         ++field7356;

         try {
            if (arg0 != -27) {
               field7353 = null;
            }

            Method var1 = (field7361 != null ? field7361 : (field7361 = method3764(field7362[7]))).getMethod(field7362[8]);
            if (var1 != null) {
               try {
                  Runtime var2 = Runtime.getRuntime();
                  Integer var3 = (Integer)var1.invoke(var2, (Object[])null);
                  class714.field10713 = var3;
               } catch (Throwable var5) {
               }
            }
         } catch (Exception var6) {
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field7362[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gt",
      name = "b",
      descriptor = "(Z)V",
      line = 180
   )
   public static void method3763(boolean arg0) {
      try {
         field7353 = null;
         field7355 = null;
         if (!arg0) {
            method3763(true);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field7362[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3765(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 61);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3766(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 100;
            break;
         case 1:
            var10005 = 10;
            break;
         case 2:
            var10005 = 60;
            break;
         case 3:
            var10005 = 33;
            break;
         default:
            var10005 = 61;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
