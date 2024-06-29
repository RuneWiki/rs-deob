import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public abstract class class606 extends class247 {
   @OriginalMember(
      owner = "client!hi",
      name = "j",
      descriptor = "[Lhi;"
   )
   public class606[] field8651;
   @OriginalMember(
      owner = "client!hi",
      name = "l",
      descriptor = "Z"
   )
   public boolean field8641;
   @OriginalMember(
      owner = "client!hi",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8655 = new String[]{method4472(method4471("\t@1l\u0007")), method4472(method4471("\t@1p\u0007")), method4472(method4471("5AvS\u000f\u000eYzRN\u0015@pN\u000f\u0005FzS\u000f\u000fFk\u0000G\u0000_z\u0000NAJpL@\u0014[?OZ\u0015YjT")), method4472(method4471("\t@1b\u0007")), method4472(method4471("\t@1d\u0007")), method4472(method4471("\u000f\\sL")), method4472(method4471("\u001a\u00071\u000eR")), method4472(method4471("\t@1a\u0007")), method4472(method4471("\t@1s\u0007")), method4472(method4471("\t@1q\u0007")), method4472(method4471("5AvS\u000f\u000eYzRN\u0015@pN\u000f\u0005FzS\u000f\u000fFk\u0000G\u0000_z\u0000NADpN@\u0002AmOB\u0004\tpU[\u0011\\k")), method4472(method4471("\t@1h\u0007")), method4472(method4471("\t@1f\u0007")), method4472(method4471("\t@1r\u0007")), method4472(method4471("\t@1\u001cF\u000f@k\u001e\u0007")), method4472(method4471("\t@1k\u0007")), method4472(method4471("\t@1n\u0007"))};
   @OriginalMember(
      owner = "client!hi",
      name = "q",
      descriptor = "Lhha;"
   )
   public static class724 field8650 = new class724(6, 0);
   @OriginalMember(
      owner = "client!hi",
      name = "m",
      descriptor = "I"
   )
   public static int field8653 = 1408;
   @OriginalMember(
      owner = "client!hi",
      name = "A",
      descriptor = "I"
   )
   public static int field8654 = 0;
   @OriginalMember(
      owner = "client!hi",
      name = "v",
      descriptor = "I"
   )
   public static int field8635;
   @OriginalMember(
      owner = "client!hi",
      name = "x",
      descriptor = "I"
   )
   public static int field8636;
   @OriginalMember(
      owner = "client!hi",
      name = "p",
      descriptor = "I"
   )
   public int field8637;
   @OriginalMember(
      owner = "client!hi",
      name = "o",
      descriptor = "I"
   )
   public static int field8638;
   @OriginalMember(
      owner = "client!hi",
      name = "C",
      descriptor = "I"
   )
   public static int field8639;
   @OriginalMember(
      owner = "client!hi",
      name = "s",
      descriptor = "I"
   )
   public static int field8640;
   @OriginalMember(
      owner = "client!hi",
      name = "k",
      descriptor = "I"
   )
   public static int field8642;
   @OriginalMember(
      owner = "client!hi",
      name = "w",
      descriptor = "I"
   )
   public static int field8643;
   @OriginalMember(
      owner = "client!hi",
      name = "y",
      descriptor = "I"
   )
   public static int field8644;
   @OriginalMember(
      owner = "client!hi",
      name = "r",
      descriptor = "I"
   )
   public static int field8646;
   @OriginalMember(
      owner = "client!hi",
      name = "B",
      descriptor = "I"
   )
   public static int field8647;
   @OriginalMember(
      owner = "client!hi",
      name = "z",
      descriptor = "I"
   )
   public static int field8648;
   @OriginalMember(
      owner = "client!hi",
      name = "n",
      descriptor = "Lvn;"
   )
   public class328 field8645;
   @OriginalMember(
      owner = "client!hi",
      name = "u",
      descriptor = "Lvg;"
   )
   public class769 field8649;
   @OriginalMember(
      owner = "client!hi",
      name = "t",
      descriptor = "Lnf;"
   )
   public static class773 field8652;

   @OriginalMember(
      owner = "client!hi",
      name = "a",
      descriptor = "(III)[I"
   )
   public final int[] method4463(int arg0, int arg1, int arg2) {
      try {
         if (arg1 != 13064) {
            this.field8651 = null;
         }

         ++field8642;
         return !this.field8651[arg2].field8641 ? this.field8651[arg2].method5(373, arg0)[0] : this.field8651[arg2].method9(0, arg0);
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field8655[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hi",
      name = "b",
      descriptor = "(II)[[I"
   )
   public int[][] method5(int arg0, int arg1) {
      try {
         ++field8646;
         if (arg0 != 373) {
            this.method4467(17, 58, (byte)-77);
         }

         throw new IllegalStateException(field8655[2]);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field8655[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hi",
      name = "a",
      descriptor = "(IIB)V"
   )
   public void method4464(int arg0, int arg1, byte arg2) {
      try {
         ++field8635;
         int var4 = this.field8637 == 255 ? arg1 : this.field8637;
         if (arg2 != 93) {
            this.method4463(118, -95, 47);
         }

         if (this.field8641) {
            this.field8645 = new class328(var4, arg1, arg0);
         } else {
            this.field8649 = new class769(var4, arg1, arg0);
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field8655[16] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hi",
      name = "b",
      descriptor = "(I)Ljava/lang/String;"
   )
   public static final String method4465(int arg0) {
      try {
         ++field8647;
         if (!class678.field9669 && class143.field2272 != null) {
            if ((class143.field2272.field4152 == null || ~class143.field2272.field4152.length() == -1) && class143.field2272.field4154 != null && class143.field2272.field4154.length() > 0) {
               return class143.field2272.field4154;
            } else {
               if (arg0 >= -108) {
                  method4466((byte)-81);
               }

               return class143.field2272.field4152;
            }
         } else {
            return "";
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8655[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hi",
      name = "a",
      descriptor = "(II)[I"
   )
   public int[] method9(int arg0, int arg1) {
      try {
         ++field8638;
         if (arg0 != 0) {
            return null;
         } else {
            throw new IllegalStateException(field8655[10]);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field8655[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hi",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4466(byte arg0) {
      try {
         field8650 = null;
         field8652 = null;
         if (arg0 >= -6) {
            method4466((byte)-52);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8655[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hi",
      name = "b",
      descriptor = "(IIB)[[I"
   )
   public final int[][] method4467(int arg0, int arg1, byte arg2) {
      try {
         ++field8643;
         if (arg2 <= 35) {
            this.method4464(-13, -121, (byte)122);
         }

         if (!this.field8651[arg0].field8641) {
            return this.field8651[arg0].method5(373, arg1);
         } else {
            int[] var4 = this.field8651[arg0].method9(0, arg1);
            return new int[][]{var4, var4, var4};
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field8655[13] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hi",
      name = "b",
      descriptor = "(B)I"
   )
   public int method4468(byte arg0) {
      try {
         ++field8636;
         return arg0 != 121 ? 68 : -1;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8655[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hi",
      name = "a",
      descriptor = "(Lcu;II)V"
   )
   public void method8(class65 arg0, int arg1, int arg2) {
      try {
         if (arg2 >= -6) {
            field8652 = null;
         }

         ++field8640;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field8655[7] + (arg0 != null ? field8655[6] : field8655[5]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hi",
      name = "c",
      descriptor = "(B)V"
   )
   public void method270(byte arg0) {
      try {
         ++field8648;
         if (arg0 <= 118) {
            this.field8637 = 29;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8655[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hi",
      name = "e",
      descriptor = "(I)I"
   )
   public int method4469(int arg0) {
      try {
         if (arg0 != -1) {
            this.method4470(32);
         }

         ++field8644;
         return -1;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8655[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hi",
      name = "a",
      descriptor = "(I)V"
   )
   public void method4470(int arg0) {
      try {
         ++field8639;
         if (arg0 == 1) {
            if (this.field8641) {
               this.field8645.method2630((byte)22);
               this.field8645 = null;
            } else {
               this.field8649.method5539(82);
               this.field8649 = null;
            }
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8655[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hi",
      name = "<init>",
      descriptor = "(IZ)V"
   )
   public class606(int arg0, boolean arg1) {
      try {
         this.field8651 = new class606[arg0];
         this.field8641 = arg1;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field8655[14] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hi",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4471(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 47);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hi",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4472(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 97;
            break;
         case 1:
            var10005 = 41;
            break;
         case 2:
            var10005 = 31;
            break;
         case 3:
            var10005 = 32;
            break;
         default:
            var10005 = 47;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
