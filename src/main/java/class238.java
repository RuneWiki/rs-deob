import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aia")
public class class238 extends class629 {
   @OriginalMember(
      owner = "client!aia",
      name = "N",
      descriptor = "I"
   )
   private int field3460 = -1;
   @OriginalMember(
      owner = "client!aia",
      name = "S",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3469 = new String[]{method1955(method1954("\u001dm#yQT")), method1955(method1954("\u0007*lyn")), method1955(method1954("\u001dm#y@T")), method1955(method1954("\u0012q.;")), method1955(method1954("\u001dm#yBT")), method1955(method1954("\u001dm#yQ=,")), method1955(method1954("\u001dm#y_T")), method1955(method1954("\u001dm#yVT")), method1955(method1954("\u001dm#yUT")), method1955(method1954("\u001dm#yGT")), method1955(method1954("\u001dm#yAT"))};
   @OriginalMember(
      owner = "client!aia",
      name = "G",
      descriptor = "[Lhca;"
   )
   public static class513[] field3466 = new class513[14];
   @OriginalMember(
      owner = "client!aia",
      name = "J",
      descriptor = "B"
   )
   public static byte field3468;
   @OriginalMember(
      owner = "client!aia",
      name = "E",
      descriptor = "I"
   )
   public static int field3454;
   @OriginalMember(
      owner = "client!aia",
      name = "R",
      descriptor = "I"
   )
   public static int field3455;
   @OriginalMember(
      owner = "client!aia",
      name = "F",
      descriptor = "I"
   )
   public int field3457;
   @OriginalMember(
      owner = "client!aia",
      name = "K",
      descriptor = "I"
   )
   public static int field3458;
   @OriginalMember(
      owner = "client!aia",
      name = "D",
      descriptor = "I"
   )
   public int field3459;
   @OriginalMember(
      owner = "client!aia",
      name = "Q",
      descriptor = "I"
   )
   public static int field3461;
   @OriginalMember(
      owner = "client!aia",
      name = "P",
      descriptor = "I"
   )
   public static int field3462;
   @OriginalMember(
      owner = "client!aia",
      name = "M",
      descriptor = "I"
   )
   public static int field3463;
   @OriginalMember(
      owner = "client!aia",
      name = "H",
      descriptor = "I"
   )
   public static int field3464;
   @OriginalMember(
      owner = "client!aia",
      name = "I",
      descriptor = "I"
   )
   public static int field3465;
   @OriginalMember(
      owner = "client!aia",
      name = "O",
      descriptor = "I"
   )
   public static int field3467;
   @OriginalMember(
      owner = "client!aia",
      name = "L",
      descriptor = "[I"
   )
   public int[] field3456;

   @OriginalMember(
      owner = "client!aia",
      name = "a",
      descriptor = "(Z[Ltd;)V"
   )
   public static final void method1947(boolean param0, class476[] param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!aia",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method1948(int arg0) {
      try {
         field3466 = null;
         if (arg0 != 0) {
            method1947(false, (class476[])null);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3469[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aia",
      name = "a",
      descriptor = "(Luda;II)V"
   )
   public final void method241(class473 arg0, int arg1, int arg2) {
      try {
         ++field3464;
         if (arg1 == 0) {
            if (~arg2 == -1) {
               this.field3460 = arg0.method3565(true);
            }
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field3469[7] + (arg0 != null ? field3469[1] : field3469[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aia",
      name = "c",
      descriptor = "(II)V"
   )
   public static final void method1949(int arg0, int arg1) {
      try {
         ++field3462;
         if (arg0 == 32550) {
            class546.method4080(-79);
            int var2 = class516.field7514.method5501(arg0 + -17358, arg1).field8626;
            if (var2 != 0) {
               int var3 = class616.field8951.field3068[arg1];
               if (var2 == 6) {
                  class234.field3415 = var3;
               }

               if (~var2 == -6) {
                  class293.field4079 = var3;
               }
            }
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field3469[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aia",
      name = "c",
      descriptor = "(III)Z"
   )
   public static final boolean method1950(int arg0, int arg1, int arg2) {
      try {
         if (arg0 < 52) {
            method1947(false, (class476[])null);
         }

         ++field3461;
         return (2048 & arg1) != 0;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field3469[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aia",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method1951(int arg0) {
      try {
         if (arg0 != -3) {
            method1948(-66);
         }

         ++field3458;
         return this.field3460;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3469[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aia",
      name = "b",
      descriptor = "(B)Z"
   )
   public final boolean method1952(byte arg0) {
      try {
         ++field3467;
         if (arg0 != -85) {
            return false;
         } else if (this.field3456 != null) {
            return true;
         } else if (this.field3460 >= 0) {
            class94 var2 = class401.field5894 < 0 ? class94.method919(class106.field1761, this.field3460) : class94.method913(class106.field1761, class401.field5894, this.field3460);
            var2.method916();
            this.field3456 = var2.method915();
            this.field3457 = var2.field1523;
            this.field3459 = var2.field1520;
            return true;
         } else {
            return false;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field3469[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aia",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method1953(int arg0) {
      try {
         if (arg0 > 48) {
            ++field3465;
            super.method1953(79);
            this.field3456 = null;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3469[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aia",
      name = "a",
      descriptor = "(II)[[I"
   )
   public int[][] method243(int arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         ++field3463;
         int[][] var4 = super.field9169.method785((byte)81, arg0);
         if (super.field9169.field1332 && this.method1952((byte)-85)) {
            label60: {
               int[] var5 = var4[0];
               int[] var6 = var4[1];
               int[] var7 = var4[2];
               int var8 = (class686.field10095 == this.field3459 ? arg0 : this.field3459 * arg0 / class686.field10095) * this.field3457;
               if (class66.field1214 == this.field3457) {
                  int var9 = 0;
                  if (var3 || class66.field1214 > var9) {
                     do {
                        int var10 = this.field3456[var8++];
                        var7[var9] = class66.method706(4080, var10 << 4);
                        var6[var9] = class66.method706(4080, var10 >> 4);
                        var5[var9] = class66.method706(var10, 16711680) >> 12;
                        ++var9;
                     } while(class66.field1214 > var9);
                  }

                  if (!var3) {
                     break label60;
                  }
               }

               int var11 = 0;
               if (var3 || ~var11 > ~class66.field1214) {
                  do {
                     int var12 = this.field3457 * var11 / class66.field1214;
                     int var13 = this.field3456[var8 - -var12];
                     var7[var11] = class66.method706(var13 << 4, 4080);
                     var6[var11] = class66.method706(var13 >> 4, 4080);
                     var5[var11] = class66.method706(var13 >> 12, 4080);
                     ++var11;
                  } while(~var11 > ~class66.field1214);
               }
            }
         }

         if (arg1 != 0) {
            this.field3460 = 121;
         }

         return var4;
      } catch (RuntimeException var15) {
         throw class608.method4462(var15, field3469[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aia",
      name = "<init>",
      descriptor = "()V"
   )
   public class238() {
      super(0, false);
   }

   @OriginalMember(
      owner = "client!aia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1954(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 19);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1955(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 124;
            break;
         case 1:
            var10005 = 4;
            break;
         case 2:
            var10005 = 66;
            break;
         case 3:
            var10005 = 87;
            break;
         default:
            var10005 = 19;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
