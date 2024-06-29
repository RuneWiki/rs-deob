import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bha")
public class class598 {
   @OriginalMember(
      owner = "client!bha",
      name = "a",
      descriptor = "I"
   )
   public int field8626 = 0;
   @OriginalMember(
      owner = "client!bha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8629 = new String[]{method4420(method4419("y\u001boSz3")), method4420(method4419("u\u0006b\u0011")), method4420(method4419("`] SD")), method4420(method4419("y\u001boS{3")), method4420(method4419("y\u001boSx3"))};
   @OriginalMember(
      owner = "client!bha",
      name = "d",
      descriptor = "I"
   )
   public static int field8625;
   @OriginalMember(
      owner = "client!bha",
      name = "b",
      descriptor = "I"
   )
   public static int field8627;
   @OriginalMember(
      owner = "client!bha",
      name = "c",
      descriptor = "I"
   )
   public static int field8628;

   @OriginalMember(
      owner = "client!bha",
      name = "a",
      descriptor = "(IIIBI)V"
   )
   public static final void method4416(int arg0, int arg1, int arg2, byte arg3, int arg4) {
      try {
         if (arg3 == -18) {
            ++field8625;
            if (arg2 >= class3.field16 && arg2 <= class581.field8354) {
               int var8 = class741.method5346(arg1, class515.field7502, class130.field2163, -1);
               int var7 = class741.method5346(arg0, class515.field7502, class130.field2163, -1);
               class25.method171(arg3 + 140, var8, arg4, var7, arg2);
            }
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field8629[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bha",
      name = "a",
      descriptor = "(BLuda;)V"
   )
   public final void method4417(byte arg0, class473 arg1) {
      boolean var3 = client.field4564;

      try {
         if (arg0 <= 46) {
            this.method4417((byte)-78, (class473)null);
         }

         while(true) {
            int var4 = arg1.method3564((byte)-66);
            if (var4 != 0) {
               this.method4418(arg1, var4, (byte)88);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            ++field8628;
            break;
         }

      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field8629[0] + arg0 + ',' + (arg1 != null ? field8629[2] : field8629[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bha",
      name = "a",
      descriptor = "(Luda;IB)V"
   )
   private final void method4418(class473 arg0, int arg1, byte arg2) {
      try {
         ++field8627;
         if (arg1 == 5) {
            this.field8626 = arg0.method3565(true);
         }

         if (arg2 != 88) {
            method4416(-2, -14, -16, (byte)-80, -36);
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field8629[3] + (arg0 != null ? field8629[2] : field8629[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4419(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 57);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4420(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 27;
            break;
         case 1:
            var10005 = 115;
            break;
         case 2:
            var10005 = 14;
            break;
         case 3:
            var10005 = 125;
            break;
         default:
            var10005 = 57;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
