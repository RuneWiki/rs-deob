import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public abstract class class277 {
   @OriginalMember(
      owner = "client!cl",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3910 = new String[]{method2179(method2178("\u0001iW^q")), method2179(method2178("\u0001iWXq")), method2179(method2178("\u0001iW_q"))};
   @OriginalMember(
      owner = "client!cl",
      name = "a",
      descriptor = "I"
   )
   public static volatile int field3907 = -1;
   @OriginalMember(
      owner = "client!cl",
      name = "e",
      descriptor = "I"
   )
   public static int field3905;
   @OriginalMember(
      owner = "client!cl",
      name = "b",
      descriptor = "I"
   )
   public static int field3906;
   @OriginalMember(
      owner = "client!cl",
      name = "d",
      descriptor = "I"
   )
   public static int field3908;
   @OriginalMember(
      owner = "client!cl",
      name = "c",
      descriptor = "Lkh;"
   )
   public static class17 field3909;

   @OriginalMember(
      owner = "client!cl",
      name = "a",
      descriptor = "(IIB)[B"
   )
   public abstract byte[] method2172(int arg0, int arg1, byte arg2);

   @OriginalMember(
      owner = "client!cl",
      name = "a",
      descriptor = "(I[B)V"
   )
   public abstract void method2173(int arg0, byte[] arg1);

   @OriginalMember(
      owner = "client!cl",
      name = "a",
      descriptor = "(IIIZI)V"
   )
   public static final void method2174(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
      try {
         label20: {
            ++field3906;
            if (class510.field7454.field11145.method2098(false) == 0) {
               class104.method991(4440, false);
               if (!client.field4564) {
                  break label20;
               }
            }

            class85.field1389 = class510.field7454.field11145.method2098(false);
            class363.method2847((byte)34, true, 0);
         }

         class396.field5815 = arg4;
         if (arg2 == 9923) {
            class368.field5466 = arg0;
            class101.field1675 = arg3;
            class370.method2892(arg1);
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field3910[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cl",
      name = "b",
      descriptor = "(IIB)Z"
   )
   public static final boolean method2175(int arg0, int arg1, byte arg2) {
      try {
         ++field3908;
         if (arg2 < 95) {
            return false;
         } else {
            return (50560 & arg0) != 0;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field3910[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cl",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2176(byte arg0) {
      try {
         field3909 = null;
         if (arg0 != -84) {
            method2175(38, 104, (byte)89);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3910[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cl",
      name = "b",
      descriptor = "(B)[B"
   )
   public abstract byte[] method2177(byte arg0);

   @OriginalMember(
      owner = "client!cl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2178(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 89);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2179(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 98;
            break;
         case 1:
            var10005 = 5;
            break;
         case 2:
            var10005 = 121;
            break;
         case 3:
            var10005 = 26;
            break;
         default:
            var10005 = 89;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
