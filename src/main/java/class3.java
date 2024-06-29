import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class3 {
   @OriginalMember(
      owner = "client!dp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field22 = new String[]{method16(method15("n!\u0013UC\"")), method16(method15("d$Q{")), method16(method15("q\u007f\u00139|")), method16(method15("n!\u0013@@\"")), method16(method15("n!\u0013VC\"")), method16(method15("n!\u0013SC\"")), method16(method15("n!\u0013TC\""))};
   @OriginalMember(
      owner = "client!dp",
      name = "a",
      descriptor = "I"
   )
   public static int field13;
   @OriginalMember(
      owner = "client!dp",
      name = "i",
      descriptor = "I"
   )
   public static int field15;
   @OriginalMember(
      owner = "client!dp",
      name = "f",
      descriptor = "I"
   )
   public static int field16;
   @OriginalMember(
      owner = "client!dp",
      name = "c",
      descriptor = "I"
   )
   public static int field17;
   @OriginalMember(
      owner = "client!dp",
      name = "g",
      descriptor = "I"
   )
   public static int field18;
   @OriginalMember(
      owner = "client!dp",
      name = "h",
      descriptor = "I"
   )
   public static int field21;
   @OriginalMember(
      owner = "client!dp",
      name = "b",
      descriptor = "Lefa;"
   )
   public static class197 field19;
   @OriginalMember(
      owner = "client!dp",
      name = "d",
      descriptor = "Ldp;"
   )
   public class3 field14;
   @OriginalMember(
      owner = "client!dp",
      name = "e",
      descriptor = "Ldp;"
   )
   public class3 field20;

   @OriginalMember(
      owner = "client!dp",
      name = "a",
      descriptor = "(ILbda;)V"
   )
   public static final void method10(int arg0, class534 arg1) {
      boolean var2 = client.field4360;

      try {
         if (arg0 != -1) {
            method13((byte)44);
         }

         ++field21;
         int var3 = 0;
         if (var2 || ~class753.field11133 < ~var3) {
            do {
               int var4 = class266.field3682[var3];
               class121 var5 = class380.field5483[var4];
               int var6 = arg1.method1143(-15465);
               if ((var6 & 4) != 0) {
                  var6 += arg1.method1143(arg0 ^ 15464) << 8;
               }

               if (~(32768 & var6) != -1) {
                  var6 += arg1.method1143(arg0 ^ 15464) << 16;
               }

               class792.method5710(var6, var4, (byte)117, arg1, var5);
               ++var3;
            } while(~class753.field11133 < ~var3);

         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field22[6] + arg0 + ',' + (arg1 != null ? field22[2] : field22[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dp",
      name = "a",
      descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;B)V"
   )
   public static final void method11(String arg0, int arg1, String arg2, String arg3, int arg4, String arg5, byte arg6) {
      try {
         ++field13;
         class516.method3756(arg5, arg3, -1, arg2, arg4, arg0, arg1, (String)null, (byte)-111);
         int var7 = 9 / ((arg6 - 32) / 45);
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field22[3] + (arg0 != null ? field22[2] : field22[1]) + ',' + arg1 + ',' + (arg2 != null ? field22[2] : field22[1]) + ',' + (arg3 != null ? field22[2] : field22[1]) + ',' + arg4 + ',' + (arg5 != null ? field22[2] : field22[1]) + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dp",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method12(byte arg0) {
      try {
         ++field16;
         if (this.field20 != null) {
            this.field20.field14 = this.field14;
            this.field14.field20 = this.field20;
            this.field14 = null;
            this.field20 = null;
            int var2 = -97 / ((arg0 - -45) / 63);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field22[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dp",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method13(byte arg0) {
      try {
         field19 = null;
         if (arg0 != 38) {
            method11((String)null, 18, (String)null, (String)null, -93, (String)null, (byte)-44);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field22[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dp",
      name = "a",
      descriptor = "(BILha;)Lbg;"
   )
   public static final class492 method14(byte arg0, int arg1, class66 arg2) {
      try {
         ++field18;
         int var3 = 112 % ((-81 - arg0) / 42);
         class699 var4 = (class699)class148.field1935.method329((byte)127, (long)arg1);
         if (var4 != null) {
            class188 var5 = var4.field10230.method4681(false);
            var4.field10229 = true;
            if (var5 != null) {
               return var5.method1489(26479, arg2);
            }
         }

         return null;
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field22[0] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field22[2] : field22[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method15(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 1);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method16(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 10;
            break;
         case 1:
            var10005 = 81;
            break;
         case 2:
            var10005 = 61;
            break;
         case 3:
            var10005 = 23;
            break;
         default:
            var10005 = 1;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
