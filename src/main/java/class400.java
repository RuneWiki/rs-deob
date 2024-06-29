import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aha")
public class class400 {
   @OriginalMember(
      owner = "client!aha",
      name = "c",
      descriptor = "Lma;"
   )
   private class14 field6143 = new class14();
   @OriginalMember(
      owner = "client!aha",
      name = "d",
      descriptor = "Ljava/lang/String;"
   )
   public String field6147;
   @OriginalMember(
      owner = "client!aha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6152 = new String[]{method3077(method3076("\u000e\u0005\u001a5z")), method3077(method3076("\u001b^Xw")), method3077(method3076("\u0014CU5@]")), method3077(method3076("\u0014CU5F]")), method3077(method3076("\u0014CU5B]")), method3077(method3076("\u0014CU5;\u001cE]o9]")), method3077(method3076("\u0014CU5A]")), method3077(method3076("\u0014CU5E]")), method3077(method3076("\u0014CU5O]")), method3077(method3076("\u0014CU5C]")), method3077(method3076("\u0014CU5D]"))};
   @OriginalMember(
      owner = "client!aha",
      name = "b",
      descriptor = "I"
   )
   public static int field6139;
   @OriginalMember(
      owner = "client!aha",
      name = "g",
      descriptor = "I"
   )
   public static int field6140;
   @OriginalMember(
      owner = "client!aha",
      name = "a",
      descriptor = "I"
   )
   public static int field6141;
   @OriginalMember(
      owner = "client!aha",
      name = "i",
      descriptor = "I"
   )
   public static int field6144;
   @OriginalMember(
      owner = "client!aha",
      name = "l",
      descriptor = "I"
   )
   public static int field6145;
   @OriginalMember(
      owner = "client!aha",
      name = "h",
      descriptor = "I"
   )
   public static int field6148;
   @OriginalMember(
      owner = "client!aha",
      name = "e",
      descriptor = "I"
   )
   public static int field6149;
   @OriginalMember(
      owner = "client!aha",
      name = "f",
      descriptor = "I"
   )
   private volatile int field6150;
   @OriginalMember(
      owner = "client!aha",
      name = "k",
      descriptor = "Lcu;"
   )
   private class229 field6151;
   @OriginalMember(
      owner = "client!aha",
      name = "j",
      descriptor = "Ljava/lang/String;"
   )
   public static String field6146;
   @OriginalMember(
      owner = "client!aha",
      name = "m",
      descriptor = "Z"
   )
   public static boolean field6142;

   @OriginalMember(
      owner = "client!aha",
      name = "a",
      descriptor = "(Lhv;III)V",
      line = 9
   )
   public static final void method3068(class544 arg0, int arg1, int arg2, int arg3) {
      try {
         ++field6148;
         if (arg0 != null) {
            if (arg0.field7990 != null) {
               class662 var4 = new class662();
               var4.field9595 = arg0.field7990;
               var4.field9589 = arg0;
               class265.method2019(var4);
            }

            class427.field6529 = arg3;
            class200.field2500 = arg0.field8054;
            class209.field2658 = arg0.field8048;
            class367.field5530 = true;
            class444.field6754 = arg0.field8015;
            if (arg2 == 0) {
               class192.field2407 = arg0.field7969;
               class30.field330 = arg0.field8042;
               class662.field9596 = arg1;
               class140.method1188(arg0, (byte)-117);
            }
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field6152[6] + (arg0 != null ? field6152[0] : field6152[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aha",
      name = "a",
      descriptor = "(B)Z",
      line = 41
   )
   public final boolean method3069(byte arg0) {
      try {
         int var2 = 26 % ((arg0 - 41) / 53);
         ++field6145;
         return this.field6150 == 0;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field6152[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aha",
      name = "a",
      descriptor = "(ILcu;)V",
      line = 54
   )
   public final void method3070(int arg0, class229 arg1) {
      try {
         ++field6141;
         this.field6151 = arg1;
         if (arg0 != 17243) {
            this.method3072(-24);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field6152[2] + arg0 + ',' + (arg1 != null ? field6152[0] : field6152[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aha",
      name = "a",
      descriptor = "(ILfw;)V",
      line = 65
   )
   public final void method3071(int arg0, class63 arg1) {
      try {
         ++field6149;
         if (arg0 <= -76) {
            class14 var3 = this.field6143;
            synchronized(this.field6143) {
               this.field6143.method100(arg1, 1);
               ++this.field6150;
            }

            if (this.field6151 != null) {
               class229 var4 = this.field6151;
               synchronized(this.field6151) {
                  this.field6151.notify();
               }
            }
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field6152[4] + arg0 + ',' + (arg1 != null ? field6152[0] : field6152[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aha",
      name = "a",
      descriptor = "(I)Liu;",
      line = 87
   )
   public final class604 method3072(int arg0) {
      try {
         ++field6139;
         Object var2 = null;
         class14 var3 = this.field6143;
         synchronized(this.field6143) {
            class604 var4 = this.field6143.method102(19230);
            var4.method4413((byte)66);
            if (arg0 != 0) {
               this.method3072(85);
            }

            --this.field6150;
            return var4;
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field6152[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aha",
      name = "a",
      descriptor = "(Lvs;Z)V",
      line = 106
   )
   public final void method3073(class616 arg0, boolean arg1) {
      try {
         ++field6140;
         arg0.field9008 = arg1;
         class14 var3 = this.field6143;
         synchronized(this.field6143) {
            this.field6143.method100(arg0, 1);
            ++this.field6150;
         }

         if (this.field6151 != null) {
            class229 var4 = this.field6151;
            synchronized(this.field6151) {
               this.field6151.notify();
            }
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field6152[10] + (arg0 != null ? field6152[0] : field6152[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aha",
      name = "a",
      descriptor = "(Lvs;I)V",
      line = 127
   )
   public final void method3074(class616 arg0, int arg1) {
      try {
         ++field6144;
         if (arg1 > -3) {
            method3068((class544)null, -9, 54, 29);
         }

         arg0.field9008 = false;
         class14 var3 = this.field6143;
         synchronized(this.field6143) {
            this.field6143.method100(arg0, 1);
            ++this.field6150;
         }

         if (this.field6151 != null) {
            class229 var4 = this.field6151;
            synchronized(this.field6151) {
               this.field6151.notify();
            }
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field6152[8] + (arg0 != null ? field6152[0] : field6152[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aha",
      name = "<init>",
      descriptor = "(Ljava/lang/String;)V",
      line = 164
   )
   public class400(String arg0) {
      try {
         this.field6147 = arg0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6152[5] + (arg0 != null ? field6152[0] : field6152[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aha",
      name = "a",
      descriptor = "(Z)V",
      line = 154
   )
   public static void method3075(boolean arg0) {
      try {
         if (arg0) {
            method3068((class544)null, 91, 8, 115);
         }

         field6146 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field6152[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3076(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 7);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3077(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 117;
            break;
         case 1:
            var10005 = 43;
            break;
         case 2:
            var10005 = 52;
            break;
         case 3:
            var10005 = 27;
            break;
         default:
            var10005 = 7;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
