import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class773 {
   @OriginalMember(
      owner = "client!qc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11331 = new String[]{method5596(method5595("P\u0007Mt\u0013")), method5596(method5595("u2Y\u0016")), method5596(method5595("P\u0007Mu\u0013")), method5596(method5595("P\u0007Mw\u0013"))};
   @OriginalMember(
      owner = "client!qc",
      name = "b",
      descriptor = "I"
   )
   public static int field11328;
   @OriginalMember(
      owner = "client!qc",
      name = "a",
      descriptor = "I"
   )
   public static int field11329;
   @OriginalMember(
      owner = "client!qc",
      name = "d",
      descriptor = "I"
   )
   public static int field11330;
   @OriginalMember(
      owner = "client!qc",
      name = "c",
      descriptor = "Ltn;"
   )
   public static class94 field11327;

   @OriginalMember(
      owner = "client!qc",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5592(int arg0) {
      try {
         field11327 = null;
         if (arg0 >= -12) {
            field11327 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field11331[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qc",
      name = "a",
      descriptor = "(BI)I"
   )
   public static final int method5593(byte arg0, int arg1) {
      boolean var2 = client.field4564;

      try {
         byte var3;
         label42: {
            ++field11330;
            if (~arg1 < -12001) {
               var3 = 4;
               class618.method4528(1);
               if (!var2) {
                  break label42;
               }
            }

            if (~arg1 < -5001) {
               class281.method2196(2);
               var3 = 3;
               if (!var2) {
                  break label42;
               }
            }

            if (~arg1 < -2001) {
               var3 = 2;
               class452.method3408(1);
               if (!var2) {
                  break label42;
               }
            }

            class461.method3459(true, (byte)-69);
            var3 = 1;
         }

         if (~class510.field7454.field11145.method2098(false) != -3) {
            class510.field7454.method5552(2, -115, class510.field7454.field11171);
            class363.method2847((byte)34, false, 2);
         }

         if (arg0 < 24) {
            field11327 = null;
         }

         class14.method99(48);
         return var3;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field11331[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qc",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method5594(boolean param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!qc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5595(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 59);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5596(char[] arg0) {
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
            var10005 = 100;
            break;
         case 2:
            var10005 = 99;
            break;
         case 3:
            var10005 = 54;
            break;
         default:
            var10005 = 59;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
