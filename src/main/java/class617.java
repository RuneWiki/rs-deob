import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class617 {
   @OriginalMember(
      owner = "client!kq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8967 = new String[]{method4527(method4526(")X^'I")), method4527(method4526(",\\\u001c\u000f")), method4527(method4526("9\u0007^M\u001c")), method4527(method4526(")X^ I")), method4527(method4526(")X^\"I"))};
   @OriginalMember(
      owner = "client!kq",
      name = "d",
      descriptor = "C"
   )
   public char field8961;
   @OriginalMember(
      owner = "client!kq",
      name = "b",
      descriptor = "I"
   )
   public static int field8959;
   @OriginalMember(
      owner = "client!kq",
      name = "a",
      descriptor = "I"
   )
   public int field8960;
   @OriginalMember(
      owner = "client!kq",
      name = "h",
      descriptor = "I"
   )
   public static int field8962;
   @OriginalMember(
      owner = "client!kq",
      name = "e",
      descriptor = "I"
   )
   public static int field8963;
   @OriginalMember(
      owner = "client!kq",
      name = "g",
      descriptor = "I"
   )
   public int field8964;
   @OriginalMember(
      owner = "client!kq",
      name = "c",
      descriptor = "I"
   )
   public static int field8965;
   @OriginalMember(
      owner = "client!kq",
      name = "f",
      descriptor = "I"
   )
   public int field8966;

   @OriginalMember(
      owner = "client!kq",
      name = "a",
      descriptor = "(Luda;I)V"
   )
   public final void method4522(class473 arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         int var4 = 4 % ((3 - arg1) / 56);
         ++field8963;

         do {
            int var5 = arg0.method3564((byte)-72);
            if (var5 == 0) {
               break;
            }

            this.method4523(arg0, -19, var5);
         } while(!var3);

      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field8967[4] + (arg0 != null ? field8967[2] : field8967[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kq",
      name = "a",
      descriptor = "(Luda;II)V"
   )
   private final void method4523(class473 arg0, int arg1, int arg2) {
      try {
         if (arg1 > -7) {
            method4525((byte)0, -72);
         }

         ++field8962;
         if (arg2 != 1) {
            if (~arg2 == -3) {
               this.field8966 = arg0.method3565(true);
               this.field8964 = arg0.method3564((byte)-110);
               this.field8960 = arg0.method3564((byte)-64);
               return;
            }
         } else {
            this.field8961 = class85.method847(16, arg0.method3543(-1132613840));
         }

      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field8967[0] + (arg0 != null ? field8967[2] : field8967[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kq",
      name = "a",
      descriptor = "(Lgq;)V"
   )
   public static final void method4524(class538 arg0) {
      if (class696.field10208 < 65535) {
         class622 var1 = arg0.field7826;
         class234.field3419[class696.field10208] = arg0;
         class764.field11079[class696.field10208] = false;
         ++class696.field10208;
         int var2 = arg0.field7842;
         if (arg0.field7839) {
            var2 = 0;
         }

         int var3 = arg0.field7842;
         if (arg0.field7836) {
            var3 = class323.field4655 - 1;
         }

         for(int var4 = var2; var4 <= var3; ++var4) {
            int var5 = 0;
            int var6 = var1.method4557((byte)-122) - var1.method4564((byte)-108) + class760.field11026 >> class76.field1336;
            if (var6 < 0) {
               var5 -= var6;
               var6 = 0;
            }

            int var7 = var1.method4557((byte)-123) + var1.method4564((byte)-108) - class760.field11026 >> class76.field1336;
            if (var7 >= class357.field5100) {
               var7 = class357.field5100 - 1;
            }

            for(int var8 = var6; var8 <= var7; ++var8) {
               short var9 = arg0.field7827[var5++];
               int var10 = (var1.method4560((byte)107) - var1.method4564((byte)-108) + class760.field11026 >> class76.field1336) + (var9 >>> 8);
               int var11 = (var9 & 255) + var10 - 1;
               if (var10 < 0) {
                  var10 = 0;
               }

               if (var11 >= class479.field6989) {
                  var11 = class479.field6989 - 1;
               }

               for(int var12 = var10; var12 <= var11; ++var12) {
                  long var13 = class236.field3434[var4][var12][var8];
                  if ((var13 & 65535L) == 0L) {
                     class236.field3434[var4][var12][var8] = var13 | (long)class696.field10208;
                  } else if ((var13 & 4294901760L) == 0L) {
                     class236.field3434[var4][var12][var8] = var13 | (long)class696.field10208 << 16;
                  } else if ((var13 & 281470681743360L) == 0L) {
                     class236.field3434[var4][var12][var8] = var13 | (long)class696.field10208 << 32;
                  } else if ((var13 & -281474976710656L) == 0L) {
                     class236.field3434[var4][var12][var8] = var13 | (long)class696.field10208 << 48;
                  }
               }
            }
         }

      }
   }

   @OriginalMember(
      owner = "client!kq",
      name = "a",
      descriptor = "(BI)Lsm;"
   )
   public static final class297 method4525(byte arg0, int arg1) {
      try {
         int var2 = 49 % ((arg0 - 66) / 59);
         ++field8959;
         if (~arg1 == -1) {
            if ((double)class370.field5488 == 3.0D) {
               return class519.field7570;
            }

            if ((double)class370.field5488 == 4.0D) {
               return class129.field2160;
            }

            if ((double)class370.field5488 == 6.0D) {
               return class215.field3234;
            }

            if ((double)class370.field5488 >= 8.0D) {
               return class205.field3061;
            }
         } else if (arg1 != 1) {
            if (arg1 == 2) {
               if ((double)class370.field5488 == 3.0D) {
                  return class713.field10345;
               }

               if ((double)class370.field5488 == 4.0D) {
                  return class559.field8134;
               }

               if ((double)class370.field5488 == 6.0D) {
                  return class251.field3593;
               }

               if ((double)class370.field5488 >= 8.0D) {
                  return class281.field3932;
               }
            }
         } else {
            if ((double)class370.field5488 == 3.0D) {
               return class215.field3234;
            }

            if ((double)class370.field5488 == 4.0D) {
               return class205.field3061;
            }

            if ((double)class370.field5488 == 6.0D) {
               return class713.field10345;
            }

            if ((double)class370.field5488 >= 8.0D) {
               return class559.field8134;
            }
         }

         return null;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field8967[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4526(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 97);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4527(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 66;
            break;
         case 1:
            var10005 = 41;
            break;
         case 2:
            var10005 = 112;
            break;
         case 3:
            var10005 = 99;
            break;
         default:
            var10005 = 97;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
