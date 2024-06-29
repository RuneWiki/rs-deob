import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public class class332 {
   @OriginalMember(
      owner = "client!iw",
      name = "d",
      descriptor = "Lub;"
   )
   public class22 field4749 = new class22();
   @OriginalMember(
      owner = "client!iw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4760 = new String[]{method2589(method2588("`J\u0014=d")), method2589(method2588("`J\u00140d")), method2589(method2588("gHV\u001a")), method2589(method2588("`J\u00148d")), method2589(method2588("r\u0013\u0014X1")), method2589(method2588("`J\u0014J%gTNHd")), method2589(method2588("`J\u00143d")), method2589(method2588("`J\u00144d")), method2589(method2588("`J\u0014:d")), method2589(method2588("`J\u0014?d")), method2589(method2588("`J\u00142d")), method2589(method2588("`J\u0014<d")), method2589(method2588("`J\u00145d")), method2589(method2588("`J\u0014>d")), method2589(method2588("`J\u0014;d")), method2589(method2588("`J\u00147d")), method2589(method2588("`J\u00141d"))};
   @OriginalMember(
      owner = "client!iw",
      name = "i",
      descriptor = "I"
   )
   public static int field4741 = 0;
   @OriginalMember(
      owner = "client!iw",
      name = "l",
      descriptor = "Z"
   )
   public static boolean field4754 = false;
   @OriginalMember(
      owner = "client!iw",
      name = "g",
      descriptor = "D"
   )
   public static double field4745;
   @OriginalMember(
      owner = "client!iw",
      name = "e",
      descriptor = "I"
   )
   public static int field4742;
   @OriginalMember(
      owner = "client!iw",
      name = "f",
      descriptor = "I"
   )
   public static int field4743;
   @OriginalMember(
      owner = "client!iw",
      name = "k",
      descriptor = "I"
   )
   public static int field4744;
   @OriginalMember(
      owner = "client!iw",
      name = "h",
      descriptor = "I"
   )
   public static int field4746;
   @OriginalMember(
      owner = "client!iw",
      name = "r",
      descriptor = "I"
   )
   public static int field4747;
   @OriginalMember(
      owner = "client!iw",
      name = "o",
      descriptor = "I"
   )
   public static int field4748;
   @OriginalMember(
      owner = "client!iw",
      name = "p",
      descriptor = "I"
   )
   public static int field4750;
   @OriginalMember(
      owner = "client!iw",
      name = "q",
      descriptor = "I"
   )
   public static int field4751;
   @OriginalMember(
      owner = "client!iw",
      name = "n",
      descriptor = "I"
   )
   public static int field4752;
   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "I"
   )
   public static int field4753;
   @OriginalMember(
      owner = "client!iw",
      name = "b",
      descriptor = "I"
   )
   public static int field4755;
   @OriginalMember(
      owner = "client!iw",
      name = "c",
      descriptor = "I"
   )
   public static int field4756;
   @OriginalMember(
      owner = "client!iw",
      name = "j",
      descriptor = "I"
   )
   public static int field4758;
   @OriginalMember(
      owner = "client!iw",
      name = "s",
      descriptor = "I"
   )
   public static int field4759;
   @OriginalMember(
      owner = "client!iw",
      name = "m",
      descriptor = "Lub;"
   )
   private class22 field4757;

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(I)Z",
      line = 5
   )
   public final boolean method2574(int arg0) {
      try {
         if (arg0 > -65) {
            this.method2583(-4);
         }

         ++field4751;
         return this.field4749.field346 == this.field4749;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4760[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "c",
      descriptor = "(I)I",
      line = 18
   )
   public final int method2575(int arg0) {
      boolean var2 = client.field4564;

      try {
         ++field4759;
         if (arg0 >= -65) {
            return -89;
         } else {
            int var3 = 0;
            class22 var4 = this.field4749.field346;
            if (var2) {
               ++var3;
               var4 = var4.field346;
            }

            while(true) {
               if (this.field4749 == var4) {
                  if (!var2) {
                     return var3;
                  }
               } else {
                  ++var3;
               }

               var4 = var4.field346;
            }
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field4760[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "b",
      descriptor = "(B)[Lfq;",
      line = 39
   )
   public static final class211[] method2576(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(Z)Lub;",
      line = 129
   )
   public final class22 method2577(boolean arg0) {
      try {
         ++field4752;
         class22 var2 = this.field4749.field346;
         if (this.field4749 == var2) {
            return null;
         } else {
            var2.method154(-105);
            if (!arg0) {
               this.method2581((class332)null, -8);
            }

            return var2;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field4760[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(ILub;)V",
      line = 157
   )
   public final void method2578(int arg0, class22 arg1) {
      try {
         ++field4747;
         int var3 = 22 % ((arg0 - 29) / 42);
         if (arg1.field343 != null) {
            arg1.method154(-119);
         }

         arg1.field346 = this.field4749.field346;
         arg1.field343 = this.field4749;
         arg1.field343.field346 = arg1;
         arg1.field346.field343 = arg1;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field4760[14] + arg0 + ',' + (arg1 != null ? field4760[4] : field4760[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "b",
      descriptor = "(I)Lub;",
      line = 174
   )
   public final class22 method2579(int arg0) {
      try {
         if (arg0 != -801) {
            return null;
         } else {
            ++field4744;
            class22 var2 = this.field4749.field346;
            if (this.field4749 == var2) {
               this.field4757 = null;
               return null;
            } else {
               this.field4757 = var2.field346;
               return var2;
            }
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field4760[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "c",
      descriptor = "(B)V",
      line = 195
   )
   public final void method2580(byte arg0) {
      boolean var2 = client.field4564;

      try {
         if (arg0 != -4) {
            field4745 = -0.4546201035532033D;
         }

         while(true) {
            class22 var3 = this.field4749.field346;
            if (this.field4749 != var3) {
               var3.method154(84);
               if (var2) {
                  break;
               }

               if (!var2) {
                  continue;
               }
            }

            ++field4758;
            this.field4757 = null;
            break;
         }

      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field4760[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(Liw;I)V",
      line = 219
   )
   public final void method2581(class332 arg0, int arg1) {
      try {
         if (arg1 == 6406) {
            this.method2582(arg1 + -7207, arg0, this.field4749.field346);
            ++field4742;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field4760[3] + (arg0 != null ? field4760[4] : field4760[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(ILiw;Lub;)V",
      line = 234
   )
   private final void method2582(int arg0, class332 arg1, class22 arg2) {
      try {
         ++field4750;
         class22 var4 = this.field4749.field343;
         this.field4749.field343 = arg2.field343;
         arg2.field343.field346 = this.field4749;
         if (arg0 != -801) {
            this.method2574(-107);
         }

         if (this.field4749 != arg2) {
            arg2.field343 = arg1.field4749.field343;
            arg2.field343.field346 = arg2;
            var4.field346 = arg1.field4749;
            arg1.field4749.field343 = var4;
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field4760[6] + arg0 + ',' + (arg1 != null ? field4760[4] : field4760[2]) + ',' + (arg2 != null ? field4760[4] : field4760[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "e",
      descriptor = "(I)Lub;",
      line = 256
   )
   public final class22 method2583(int arg0) {
      try {
         ++field4753;
         class22 var2 = this.field4757;
         if (this.field4749 == var2) {
            this.field4757 = null;
            return null;
         } else {
            this.field4757 = var2.field346;
            if (arg0 != 1) {
               this.method2585((class22)null, 40);
            }

            return var2;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field4760[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "d",
      descriptor = "(I)Lub;",
      line = 277
   )
   public final class22 method2584(int arg0) {
      try {
         ++field4756;
         class22 var2 = this.field4757;
         if (this.field4749 == var2) {
            this.field4757 = null;
            return null;
         } else {
            this.field4757 = var2.field343;
            return arg0 != 1 ? null : var2;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field4760[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(Lub;I)V",
      line = 302
   )
   public final void method2585(class22 arg0, int arg1) {
      try {
         if (arg0.field343 != null) {
            arg0.method154(-110);
         }

         ++field4746;
         arg0.field346 = this.field4749;
         arg0.field343 = this.field4749.field343;
         arg0.field343.field346 = arg0;
         arg0.field346.field343 = arg0;
         int var3 = -15 % ((-9 - arg1) / 45);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field4760[10] + (arg0 != null ? field4760[4] : field4760[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "<init>",
      descriptor = "()V",
      line = 378
   )
   public class332() {
      try {
         this.field4749.field343 = this.field4749;
         this.field4749.field346 = this.field4749;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field4760[5] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(B)Lub;",
      line = 322
   )
   public final class22 method2586(byte arg0) {
      try {
         ++field4748;
         class22 var2 = this.field4749.field343;
         int var3 = -39 / ((30 - arg0) / 59);
         if (this.field4749 == var2) {
            this.field4757 = null;
            return null;
         } else {
            this.field4757 = var2.field343;
            return var2;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field4760[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(IB)I",
      line = 343
   )
   public static final int method2587(int arg0, byte arg1) {
      try {
         ++field4743;
         if (arg0 == 6406) {
            return 1;
         } else if (~arg0 != -6410) {
            if (~arg0 != -32842) {
               if (arg0 == 6410) {
                  return 2;
               } else if (~arg0 != -6408) {
                  if (arg0 == 6408) {
                     return 4;
                  } else {
                     if (arg1 != -93) {
                        method2576((byte)-40);
                     }

                     throw new IllegalArgumentException("");
                  }
               } else {
                  return 3;
               }
            } else {
               return 1;
            }
         } else {
            return 1;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4760[15] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2588(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 76);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!iw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2589(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 9;
            break;
         case 1:
            var10005 = 61;
            break;
         case 2:
            var10005 = 58;
            break;
         case 3:
            var10005 = 118;
            break;
         default:
            var10005 = 76;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
