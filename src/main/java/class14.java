import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class14 {
   @OriginalMember(
      owner = "client!ma",
      name = "j",
      descriptor = "Liu;"
   )
   private class604 field163 = new class604();
   @OriginalMember(
      owner = "client!ma",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field177 = new String[]{method106(method105("\u0012\u0015\u001b\u0004T")), method106(method105("\u0012\u0015\u001b\u000fT")), method106(method105("\u0012\u0015\u001b\fT")), method106(method105("\u0011\u0001Y*")), method106(method105("\u0012\u0015\u001b\u0000T")), method106(method105("\u0004Z\u001bh\u0001")), method106(method105("\u0012\u0015\u001b\u0005T")), method106(method105("\u0012\u0015\u001bz\u0015\u0011\u001dAxT")), method106(method105("\u0012\u0015\u001b\u0007T")), method106(method105("\u0012\u0015\u001b\u0002T")), method106(method105("\u0012\u0015\u001b\u0003T")), method106(method105("\u0012\u0015\u001b\u000eT")), method106(method105("\u0012\u0015\u001b\u0001T"))};
   @OriginalMember(
      owner = "client!ma",
      name = "l",
      descriptor = "[[Z"
   )
   public static boolean[][] field169 = new boolean[][]{{true, true, true, true, true, true, true, true, true, true, true, true, true}, {true, true, true, false, false, false, true, true, false, false, false, false, true}, {true, false, false, false, false, true, true, true, false, false, false, false, false}, {false, false, true, true, true, true, false, false, false, false, false, false, false}, {true, true, true, true, true, true, false, false, false, false, false, false, false}, {true, true, true, false, false, true, true, true, false, false, false, false, false}, {true, true, false, false, false, true, true, true, false, false, false, false, true}, {true, true, false, false, false, false, false, true, false, false, false, false, false}, {false, true, true, true, true, true, true, true, false, false, false, false, false}, {true, false, false, false, true, true, true, true, true, true, false, false, false}, {true, true, true, true, true, false, false, false, true, true, false, false, false}, {true, true, true, false, false, false, false, false, false, false, true, true, false}, new boolean[13], {true, true, true, true, true, true, true, true, true, true, true, true, true}, new boolean[13]};
   @OriginalMember(
      owner = "client!ma",
      name = "g",
      descriptor = "[I"
   )
   public static int[] field162 = new int[1];
   @OriginalMember(
      owner = "client!ma",
      name = "h",
      descriptor = "[[F"
   )
   public static float[][] field171 = new float[][]{{-0.333333F, -0.333333F, -0.333333F}, {0.333333F, -0.333333F, -0.333333F}, {-0.333333F, 0.333333F, -0.333333F}, {0.333333F, 0.333333F, -0.333333F}, {-0.333333F, -0.333333F, 0.333333F}, {0.333333F, -0.333333F, 0.333333F}, {-0.333333F, 0.333333F, 0.333333F}, {0.333333F, 0.333333F, 0.333333F}};
   @OriginalMember(
      owner = "client!ma",
      name = "f",
      descriptor = "I"
   )
   public static int field164;
   @OriginalMember(
      owner = "client!ma",
      name = "n",
      descriptor = "I"
   )
   public static int field165;
   @OriginalMember(
      owner = "client!ma",
      name = "o",
      descriptor = "I"
   )
   public static int field166;
   @OriginalMember(
      owner = "client!ma",
      name = "i",
      descriptor = "I"
   )
   public static int field167;
   @OriginalMember(
      owner = "client!ma",
      name = "d",
      descriptor = "I"
   )
   public static int field168;
   @OriginalMember(
      owner = "client!ma",
      name = "b",
      descriptor = "I"
   )
   public static int field170;
   @OriginalMember(
      owner = "client!ma",
      name = "c",
      descriptor = "I"
   )
   public static int field172;
   @OriginalMember(
      owner = "client!ma",
      name = "e",
      descriptor = "I"
   )
   public static int field173;
   @OriginalMember(
      owner = "client!ma",
      name = "k",
      descriptor = "I"
   )
   public static int field175;
   @OriginalMember(
      owner = "client!ma",
      name = "a",
      descriptor = "Leaa;"
   )
   public static class526 field174;
   @OriginalMember(
      owner = "client!ma",
      name = "m",
      descriptor = "Liu;"
   )
   private class604 field176;

   @OriginalMember(
      owner = "client!ma",
      name = "a",
      descriptor = "(B)Liu;",
      line = 4
   )
   public final class604 method95(byte arg0) {
      try {
         ++field172;
         class604 var2 = this.field176;
         if (this.field163 == var2) {
            this.field176 = null;
            return null;
         } else {
            this.field176 = var2.field8886;
            return arg0 < 96 ? null : var2;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field177[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ma",
      name = "a",
      descriptor = "(III)Z",
      line = 25
   )
   public static final boolean method96(int arg0, int arg1, int arg2) {
      try {
         ++field173;
         if (arg1 != -1) {
            method104(-53);
         }

         return ~(arg2 & 50560) != -1;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field177[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ma",
      name = "b",
      descriptor = "(I)Liu;",
      line = 38
   )
   public final class604 method97(int arg0) {
      try {
         ++field166;
         class604 var2 = this.field163.field8881;
         if (this.field163 == var2) {
            this.field176 = null;
            return null;
         } else {
            if (arg0 != 0) {
               this.method95((byte)-91);
            }

            this.field176 = var2.field8881;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field177[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ma",
      name = "b",
      descriptor = "(Z)V",
      line = 62
   )
   public final void method98(boolean arg0) {
      int var2 = client.field4530;

      try {
         if (arg0) {
            ++field165;

            while(true) {
               class604 var3 = this.field163.field8886;
               if (this.field163 != var3) {
                  var3.method4413((byte)122);
                  if (var2 != 0) {
                     break;
                  }

                  if (var2 == 0) {
                     continue;
                  }
               }

               this.field176 = null;
               break;
            }

         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field177[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ma",
      name = "b",
      descriptor = "(B)I",
      line = 87
   )
   public final int method99(byte arg0) {
      int var2 = client.field4530;

      try {
         ++field164;
         int var3 = 42 % ((arg0 - 15) / 48);
         int var4 = 0;
         class604 var5 = this.field163.field8886;
         if (var2 != 0) {
            var5 = var5.field8886;
            ++var4;
         }

         while(true) {
            while(this.field163 != var5) {
               var5 = var5.field8886;
               ++var4;
            }

            if (var2 == 0) {
               return var4;
            }

            ++var4;
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field177[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ma",
      name = "a",
      descriptor = "(Liu;I)V",
      line = 107
   )
   public final void method100(class604 arg0, int arg1) {
      try {
         if (arg0.field8881 != null) {
            arg0.method4413((byte)48);
         }

         ++field170;
         arg0.field8886 = this.field163;
         if (arg1 == 1) {
            arg0.field8881 = this.field163.field8881;
            arg0.field8881.field8886 = arg0;
            arg0.field8886.field8881 = arg0;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field177[4] + (arg0 != null ? field177[5] : field177[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ma",
      name = "d",
      descriptor = "(I)Liu;",
      line = 134
   )
   public final class604 method101(int arg0) {
      try {
         ++field167;
         class604 var2 = this.field163.field8886;
         if (this.field163 == var2) {
            return null;
         } else {
            var2.method4413((byte)66);
            if (arg0 != -9167) {
               this.method97(-27);
            }

            return var2;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field177[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ma",
      name = "<init>",
      descriptor = "()V",
      line = 203
   )
   public class14() {
      try {
         this.field163.field8886 = this.field163;
         this.field163.field8881 = this.field163;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field177[7] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ma",
      name = "a",
      descriptor = "(I)Liu;",
      line = 155
   )
   public final class604 method102(int arg0) {
      try {
         ++field168;
         class604 var2 = this.field163.field8886;
         if (arg0 != 19230) {
            this.method101(-101);
         }

         if (this.field163 == var2) {
            this.field176 = null;
            return null;
         } else {
            this.field176 = var2.field8886;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field177[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ma",
      name = "a",
      descriptor = "(Z)Z",
      line = 177
   )
   public final boolean method103(boolean arg0) {
      try {
         if (arg0) {
            this.method98(true);
         }

         ++field175;
         return this.field163.field8886 == this.field163;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field177[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ma",
      name = "c",
      descriptor = "(I)V",
      line = 212
   )
   public static void method104(int arg0) {
      try {
         field162 = null;
         field171 = null;
         field174 = null;
         field169 = null;
         if (arg0 != 0) {
            method104(1);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field177[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ma",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method105(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 124);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ma",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method106(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 127;
            break;
         case 1:
            var10005 = 116;
            break;
         case 2:
            var10005 = 53;
            break;
         case 3:
            var10005 = 70;
            break;
         default:
            var10005 = 124;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
