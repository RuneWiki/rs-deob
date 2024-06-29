import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tja")
public class class51 extends class445 {
   @OriginalMember(
      owner = "client!tja",
      name = "I",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field771 = new String[]{method556(method555("]^\u0003\u001e;\u0001")), method556(method555("]^\u0003\u001e6\u0001")), method556(method555("]^\u0003\u001e:\u0001")), method556(method555("]^\u0003\u001e5\u0001")), method556(method555("]^\u0003\u001e7\u0001"))};
   @OriginalMember(
      owner = "client!tja",
      name = "x",
      descriptor = "Lbba;"
   )
   public static class801 field760 = new class801();
   @OriginalMember(
      owner = "client!tja",
      name = "G",
      descriptor = "I"
   )
   public static int field770 = 0;
   @OriginalMember(
      owner = "client!tja",
      name = "F",
      descriptor = "F"
   )
   public static float field768;
   @OriginalMember(
      owner = "client!tja",
      name = "E",
      descriptor = "I"
   )
   public static int field763;
   @OriginalMember(
      owner = "client!tja",
      name = "H",
      descriptor = "I"
   )
   public static int field764;
   @OriginalMember(
      owner = "client!tja",
      name = "A",
      descriptor = "I"
   )
   public int field765;
   @OriginalMember(
      owner = "client!tja",
      name = "y",
      descriptor = "I"
   )
   public static int field767;
   @OriginalMember(
      owner = "client!tja",
      name = "z",
      descriptor = "I"
   )
   public static int field769;
   @OriginalMember(
      owner = "client!tja",
      name = "B",
      descriptor = "Lql;"
   )
   public class717 field761;
   @OriginalMember(
      owner = "client!tja",
      name = "C",
      descriptor = "[B"
   )
   public byte[] field766;
   @OriginalMember(
      owner = "client!tja",
      name = "D",
      descriptor = "[[B"
   )
   public static byte[][] field762;

   @OriginalMember(
      owner = "client!tja",
      name = "e",
      descriptor = "(I)I"
   )
   public final int method550(int arg0) {
      try {
         if (arg0 != -25183) {
            field762 = null;
         }

         ++field763;
         return super.field6490 ? 0 : 100;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field771[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tja",
      name = "a",
      descriptor = "(ZIZI)I"
   )
   public static final int method551(boolean arg0, int arg1, boolean arg2, int arg3) {
      boolean var4 = client.field10022;

      try {
         ++field767;
         class380 var5 = class231.method2056(arg3, arg0, Integer.MIN_VALUE);
         if (var5 == null) {
            return 0;
         } else if (~arg1 == 0) {
            return 0;
         } else {
            int var6 = 0;
            if (arg2) {
               field762 = null;
            }

            int var7 = 0;
            int var10000;
            if (var4) {
               var10000 = ~arg1;
            } else if (var7 >= var5.field5560.length) {
               var10000 = var6;
               if (!var4) {
                  return var6;
               }
            } else {
               var10000 = ~arg1;
            }

            while(true) {
               if (var10000 == ~var5.field5559[var7]) {
                  var6 += var5.field5560[var7];
               }

               ++var7;
               if (var7 >= var5.field5560.length) {
                  var10000 = var6;
                  if (!var4) {
                     return var6;
                  }
               } else {
                  var10000 = ~arg1;
               }
            }
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field771[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tja",
      name = "a",
      descriptor = "(I)[B"
   )
   public final byte[] method552(int arg0) {
      try {
         ++field769;
         if (super.field6490) {
            throw new RuntimeException();
         } else {
            if (arg0 != 0) {
               this.field761 = null;
            }

            return this.field766;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field771[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tja",
      name = "a",
      descriptor = "(ZII)Z"
   )
   public static final boolean method553(boolean arg0, int arg1, int arg2) {
      try {
         if (arg0) {
            return true;
         } else {
            ++field764;
            return ~(1048832 & arg1) != -1;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field771[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tja",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method554(byte arg0) {
      try {
         if (arg0 >= -32) {
            field768 = 0.7662418F;
         }

         field760 = null;
         field762 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field771[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method555(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 114);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method556(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 41;
            break;
         case 1:
            var10005 = 52;
            break;
         case 2:
            var10005 = 98;
            break;
         case 3:
            var10005 = 48;
            break;
         default:
            var10005 = 114;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
