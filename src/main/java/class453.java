import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uba")
public class class453 {
   @OriginalMember(
      owner = "client!uba",
      name = "o",
      descriptor = "I"
   )
   private int field6887 = 0;
   @OriginalMember(
      owner = "client!uba",
      name = "k",
      descriptor = "I"
   )
   private int field6890 = -1;
   @OriginalMember(
      owner = "client!uba",
      name = "a",
      descriptor = "Lum;"
   )
   private class550 field6881 = new class550();
   @OriginalMember(
      owner = "client!uba",
      name = "m",
      descriptor = "Z"
   )
   public boolean field6892 = false;
   @OriginalMember(
      owner = "client!uba",
      name = "l",
      descriptor = "I"
   )
   private int field6883;
   @OriginalMember(
      owner = "client!uba",
      name = "g",
      descriptor = "I"
   )
   private int field6886;
   @OriginalMember(
      owner = "client!uba",
      name = "f",
      descriptor = "[Lkh;"
   )
   private class17[] field6884;
   @OriginalMember(
      owner = "client!uba",
      name = "j",
      descriptor = "[[[I"
   )
   private int[][][] field6882;
   @OriginalMember(
      owner = "client!uba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6893 = new String[]{method3414(method3413("0.\u0019:\f,\"\u0011`\u000em")), method3414(method3413("0.\u0019:sm")), method3414(method3413("0.\u0019:um")), method3414(method3413("0.\u0019:tm")), method3414(method3413("0.\u0019:qm")), method3414(method3413("0.\u0019:rm")), method3414(method3413("0.\u0019:vm")), method3414(method3413("\u0006-\u00164_+ \u00014B 8\n}U3)Xu\u0010#9\u0014x\u0010,!\u0019sUe/\u0019wX "))};
   @OriginalMember(
      owner = "client!uba",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field6888 = new int[]{99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120};
   @OriginalMember(
      owner = "client!uba",
      name = "e",
      descriptor = "I"
   )
   public static int field6878;
   @OriginalMember(
      owner = "client!uba",
      name = "n",
      descriptor = "I"
   )
   public static int field6879;
   @OriginalMember(
      owner = "client!uba",
      name = "b",
      descriptor = "I"
   )
   public static int field6880;
   @OriginalMember(
      owner = "client!uba",
      name = "d",
      descriptor = "I"
   )
   public static int field6885;
   @OriginalMember(
      owner = "client!uba",
      name = "h",
      descriptor = "I"
   )
   public static int field6889;
   @OriginalMember(
      owner = "client!uba",
      name = "i",
      descriptor = "I"
   )
   public static int field6891;

   @OriginalMember(
      owner = "client!uba",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method3407(byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!uba",
      name = "b",
      descriptor = "(I)[Lce;"
   )
   public static final class324[] method3408(int arg0) {
      try {
         if (arg0 != 0) {
            return null;
         } else {
            ++field6880;
            return new class324[]{class498.field7376, class663.field9636, class358.field5415};
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field6893[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uba",
      name = "a",
      descriptor = "(II)[[I"
   )
   public final int[][] method3409(int arg0, int arg1) {
      int var3 = client.field4530;

      try {
         ++field6891;
         if (arg1 != 0) {
            return null;
         } else if (this.field6886 == this.field6883) {
            this.field6892 = this.field6884[arg0] == null;
            this.field6884[arg0] = class430.field6572;
            return this.field6882[arg0];
         } else if (~this.field6883 == -2) {
            this.field6892 = this.field6890 != arg0;
            this.field6890 = arg0;
            return this.field6882[0];
         } else {
            class17 var4;
            label43: {
               var4 = this.field6884[arg0];
               if (var4 == null) {
                  label40: {
                     this.field6892 = true;
                     if (~this.field6887 <= ~this.field6883) {
                        class17 var5 = (class17)this.field6881.method4061(false);
                        var4 = new class17(arg0, var5.field201);
                        this.field6884[var5.field200] = null;
                        var5.method2720(arg1);
                        if (var3 == 0) {
                           break label40;
                        }
                     }

                     var4 = new class17(arg0, this.field6887);
                     ++this.field6887;
                  }

                  this.field6884[arg0] = var4;
                  if (var3 == 0) {
                     break label43;
                  }
               }

               this.field6892 = false;
            }

            this.field6881.method4070(var4, (byte)50);
            return this.field6882[var4.field201];
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field6893[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uba",
      name = "a",
      descriptor = "(JZI)Luj;"
   )
   public static final class403 method3410(long arg0, boolean arg1, int arg2) {
      try {
         ++field6889;
         if (!arg1) {
            method3410(-92L, false, 115);
         }

         class403 var4 = (class403)class201.field2535.method5681(arg0 | (long)arg2 << 56, -1);
         if (var4 == null) {
            var4 = new class403(arg2, arg0);
            class201.field2535.method5682(var4.field5280, var4, (byte)7);
         }

         return var4;
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field6893[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uba",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method3411(byte arg0) {
      try {
         field6888 = null;
         if (arg0 != -120) {
            field6879 = 101;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field6893[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uba",
      name = "a",
      descriptor = "(I)[[[I"
   )
   public final int[][][] method3412(int arg0) {
      int var2 = client.field4530;

      try {
         ++field6885;
         if (this.field6886 != this.field6883) {
            throw new RuntimeException(field6893[7]);
         } else if (arg0 < 123) {
            return null;
         } else {
            int var3 = 0;
            if (var2 != 0) {
               this.field6884[var3] = class430.field6572;
               ++var3;
            }

            while(true) {
               class453 var10000;
               if (var3 >= this.field6883) {
                  var10000 = this;
                  if (var2 == 0) {
                     return this.field6882;
                  }
               } else {
                  var10000 = this;
               }

               var10000.field6884[var3] = class430.field6572;
               ++var3;
            }
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field6893[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uba",
      name = "<init>",
      descriptor = "(III)V"
   )
   public class453(int arg0, int arg1, int arg2) {
      try {
         this.field6883 = arg0;
         this.field6886 = arg1;
         this.field6884 = new class17[this.field6886];
         this.field6882 = new int[this.field6883][3][arg2];
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field6893[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3413(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 48);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3414(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 69;
            break;
         case 1:
            var10005 = 76;
            break;
         case 2:
            var10005 = 120;
            break;
         case 3:
            var10005 = 20;
            break;
         default:
            var10005 = 48;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
