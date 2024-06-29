import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class746 {
   @OriginalMember(
      owner = "client!sl",
      name = "a",
      descriptor = "[I"
   )
   private int[] field10612;
   @OriginalMember(
      owner = "client!sl",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10615 = new String[]{method5375(method5374("RX\"lt")), method5375(method5374("RX\"ot")), method5375(method5374("RX\"jt")), method5375(method5374("RX\"mt")), method5375(method5374("RX\"\u00125O]x\u0010t")), method5375(method5374("Z\u001a\"\u0000!")), method5375(method5374("OA`B"))};
   @OriginalMember(
      owner = "client!sl",
      name = "b",
      descriptor = "I"
   )
   public static int field10608;
   @OriginalMember(
      owner = "client!sl",
      name = "d",
      descriptor = "I"
   )
   public static int field10609;
   @OriginalMember(
      owner = "client!sl",
      name = "c",
      descriptor = "I"
   )
   public static int field10613;
   @OriginalMember(
      owner = "client!sl",
      name = "g",
      descriptor = "I"
   )
   public static int field10614;
   @OriginalMember(
      owner = "client!sl",
      name = "f",
      descriptor = "Lio;"
   )
   public static class124 field10611;
   @OriginalMember(
      owner = "client!sl",
      name = "e",
      descriptor = "Ljga;"
   )
   public static class91 field10610;

   @OriginalMember(
      owner = "client!sl",
      name = "a",
      descriptor = "(I)[I"
   )
   public static final int[] method5370(int arg0) {
      try {
         if (arg0 != 1) {
            method5373(-96, 106, -23);
         }

         ++field10614;
         return new int[]{class313.field4704, class622.field8893, class502.field7166};
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field10615[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sl",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method5371(int arg0) {
      try {
         field10610 = null;
         if (arg0 != 1) {
            method5370(-96);
         }

         field10611 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field10615[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sl",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method5372(int arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         ++field10609;
         if (arg1 != 1) {
            method5373(-110, -125, -59);
         }

         int var4 = (this.field10612.length >> 1) + -1;
         int var5 = var4 & arg0;

         while(true) {
            int var6 = this.field10612[var5 + 1 + var5];
            int var10000;
            if (var6 == -1) {
               var10000 = -1;
               if (!var3) {
                  return -1;
               }
            } else {
               var10000 = ~arg0;
            }

            if (var10000 == ~this.field10612[var5 + var5]) {
               return var6;
            }

            var5 = var4 & var5 - -1;
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field10615[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sl",
      name = "<init>",
      descriptor = "([I)V"
   )
   public class746(int[] arg0) {
      boolean var2 = client.field10022;
      super();

      try {
         int var3 = 1;
         if (var2) {
            var3 <<= 1;
         }

         while(true) {
            while(var3 <= (arg0.length >> 1) + arg0.length) {
               var3 <<= 1;
            }

            this.field10612 = new int[var3 + var3];
            if (!var2) {
               int var4 = 0;
               if (var2) {
                  this.field10612[var4] = -1;
                  ++var4;
               }

               while(true) {
                  while(~(var3 + var3) < ~var4) {
                     this.field10612[var4] = -1;
                     ++var4;
                  }

                  int var5 = 0;
                  if (!var2) {
                     if (!var2 && var5 >= arg0.length) {
                        return;
                     }

                     do {
                        int var6 = var3 + -1 & arg0[var5];
                        if (var2) {
                           var6 = var3 + -1 & var6 + 1;
                        }

                        while(this.field10612[var6 + var6 - -1] != -1) {
                           var6 = var3 + -1 & var6 + 1;
                        }

                        this.field10612[var6 + var6] = arg0[var5];
                        this.field10612[var6 - (-var6 - 1)] = var5++;
                     } while(var5 < arg0.length);

                     return;
                  }

                  ++var4;
               }
            }

            var3 = 0;
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field10615[4] + (arg0 != null ? field10615[5] : field10615[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sl",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method5373(int arg0, int arg1, int arg2) {
      try {
         int var3 = -58 % ((arg2 - 49) / 46);
         ++field10613;
         return ~(arg0 & 50560) != -1;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field10615[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5374(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 92);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5375(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 33;
            break;
         case 1:
            var10005 = 52;
            break;
         case 2:
            var10005 = 12;
            break;
         case 3:
            var10005 = 46;
            break;
         default:
            var10005 = 92;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
