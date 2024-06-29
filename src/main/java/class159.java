import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class159 extends class720 {
   @OriginalMember(
      owner = "client!ho",
      name = "R",
      descriptor = "[[B"
   )
   private byte[][] field2537 = new byte[10][];
   @OriginalMember(
      owner = "client!ho",
      name = "Q",
      descriptor = "Luda;"
   )
   private class473 field2532 = new class473((byte[])null);
   @OriginalMember(
      owner = "client!ho",
      name = "M",
      descriptor = "Luda;"
   )
   private class473 field2543 = new class473((byte[])null);
   @OriginalMember(
      owner = "client!ho",
      name = "I",
      descriptor = "I"
   )
   private int field2539;
   @OriginalMember(
      owner = "client!ho",
      name = "S",
      descriptor = "Lhw;"
   )
   private class141 field2533;
   @OriginalMember(
      owner = "client!ho",
      name = "U",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2544 = new String[]{method1454(method1453("?ic`T")), method1454(method1453(",(c\u000f\u0001")), method1454(method1453("9s!M")), method1454(method1453("?ic\u001d\u00159o9\u001fT")), method1454(method1453("?iccT")), method1454(method1453("?icbT")), method1454(method1453("?iceT"))};
   @OriginalMember(
      owner = "client!ho",
      name = "N",
      descriptor = "Lgh;"
   )
   public static class572 field2536 = new class572(66, 0);
   @OriginalMember(
      owner = "client!ho",
      name = "J",
      descriptor = "Lgh;"
   )
   public static class572 field2542 = new class572(93, 0);
   @OriginalMember(
      owner = "client!ho",
      name = "K",
      descriptor = "I"
   )
   public static int field2534;
   @OriginalMember(
      owner = "client!ho",
      name = "O",
      descriptor = "I"
   )
   private int field2535;
   @OriginalMember(
      owner = "client!ho",
      name = "P",
      descriptor = "I"
   )
   public static int field2538;
   @OriginalMember(
      owner = "client!ho",
      name = "T",
      descriptor = "I"
   )
   public static int field2540;
   @OriginalMember(
      owner = "client!ho",
      name = "L",
      descriptor = "I"
   )
   public static int field2541;
   @OriginalMember(
      owner = "client!ho",
      name = "H",
      descriptor = "[I"
   )
   private int[] field2531;

   @OriginalMember(
      owner = "client!ho",
      name = "a",
      descriptor = "([BB)I",
      line = 4
   )
   public final int method1449(byte[] arg0, byte arg1) throws IOException {
      boolean var3 = client.field4564;

      try {
         ++field2534;
         if (this.field2531 == null) {
            if (!this.field2533.method1339(0, -97, this.field2539)) {
               return 0;
            }

            byte[] var4 = this.field2533.method1347((byte)126, this.field2539, 0);
            if (var4 == null) {
               throw new IllegalStateException("");
            }

            this.field2543.field6889 = var4;
            this.field2543.field6907 = 0;
            int var5 = var4.length >> 1;
            this.field2531 = new int[var5];
            int var6 = 0;
            if (var3 || var5 > var6) {
               do {
                  this.field2531[var6] = this.field2543.method3565(true);
                  ++var6;
               } while(var5 > var6);
            }
         }

         if (~this.field2535 <= ~this.field2531.length) {
            return -1;
         } else {
            this.method1450(0);
            this.field2543.field6907 = 0;
            this.field2543.field6889 = arg0;
            if (!var3 && this.field2543.field6907 >= this.field2543.field6889.length) {
               if (arg1 < 97) {
                  return 75;
               } else {
                  this.field2543.field6889 = null;
                  return arg0.length;
               }
            } else {
               label96:
               do {
                  if (this.field2532.field6889 == null) {
                     if (this.field2537[0] == null) {
                        this.field2543.field6889 = null;
                        return this.field2543.field6907;
                     }

                     this.field2532.field6889 = this.field2537[0];
                  }

                  int var7 = this.field2543.field6889.length + -this.field2543.field6907;
                  int var8 = this.field2532.field6889.length + -this.field2532.field6907;
                  int var10000 = var7;

                  do {
                     if (var10000 < var8) {
                        this.field2532.method3562(this.field2543.field6907, this.field2543.field6889, -127, var7);
                        this.field2543.field6889 = null;
                        return arg0.length;
                     }

                     this.field2543.method3536(this.field2532.field6907, var8, this.field2532.field6889, -13091);
                     this.field2532.field6907 = 0;
                     ++this.field2535;
                     this.field2532.field6889 = null;
                     int var9 = 0;
                     if (var3) {
                        this.field2537[var9] = this.field2537[var9 + 1];
                        ++var9;
                     }

                     while(true) {
                        class159 var12;
                        if (~var9 <= -10) {
                           this.field2537[9] = null;
                           var12 = this;
                           if (!var3) {
                              if (this.field2535 < this.field2531.length) {
                                 continue label96;
                              }

                              this.field2543.field6889 = null;
                              var10000 = this.field2543.field6907;
                              break;
                           }
                        } else {
                           var12 = this;
                        }

                        var12.field2537[var9] = this.field2537[var9 + 1];
                        ++var9;
                     }
                  } while(var3);

                  return var10000;
               } while(this.field2543.field6907 < this.field2543.field6889.length);

               if (arg1 < 97) {
                  return 75;
               } else {
                  this.field2543.field6889 = null;
                  return arg0.length;
               }
            }
         }
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field2544[6] + (arg0 != null ? field2544[1] : field2544[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ho",
      name = "i",
      descriptor = "(I)V",
      line = 98
   )
   public final void method1450(int arg0) {
      boolean var2 = client.field4564;

      try {
         ++field2538;
         if (this.field2531 != null) {
            int var3 = arg0;
            if (!var2) {
               if (arg0 >= 10) {
                  return;
               }

               if (arg0 - -this.field2535 >= this.field2531.length) {
                  return;
               }
            }

            do {
               if (this.field2537[var3] == null && this.field2533.method1339(0, -46, this.field2531[this.field2535 + var3])) {
                  this.field2537[var3] = this.field2533.method1347((byte)125, this.field2531[this.field2535 + var3], 0);
               }

               ++var3;
               if (var3 >= 10) {
                  return;
               }
            } while(var3 - -this.field2535 < this.field2531.length);

         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field2544[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ho",
      name = "f",
      descriptor = "(B)V",
      line = 131
   )
   public static void method1451(byte arg0) {
      try {
         int var1 = 33 % ((-38 - arg0) / 41);
         field2542 = null;
         field2536 = null;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2544[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ho",
      name = "a",
      descriptor = "(II)Lqi;",
      line = 141
   )
   public static final class591 method1452(int arg0, int arg1) {
      boolean var2 = client.field4564;

      try {
         ++field2541;
         class591[] var3 = class151.method1409((byte)125);
         int var4 = arg1;
         if (!var2 && var3.length <= arg1) {
            return null;
         } else {
            do {
               class591 var5 = var3[var4];
               if (var5.field8524 == arg0) {
                  return var5;
               }

               ++var4;
            } while(var3.length > var4);

            return null;
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field2544[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ho",
      name = "<init>",
      descriptor = "(ILhw;I)V",
      line = 165
   )
   public class159(int arg0, class141 arg1, int arg2) {
      super(arg0);

      try {
         this.field2539 = arg2;
         this.field2533 = arg1;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field2544[3] + arg0 + ',' + (arg1 != null ? field2544[1] : field2544[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ho",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1453(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 124);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ho",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1454(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 87;
            break;
         case 1:
            var10005 = 6;
            break;
         case 2:
            var10005 = 77;
            break;
         case 3:
            var10005 = 33;
            break;
         default:
            var10005 = 124;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
