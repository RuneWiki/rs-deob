import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class392 {
   @OriginalMember(
      owner = "client!om",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5958 = new String[]{method3000(method2999("%+\u00196")), method3000(method2999("0p[tA")), method3000(method2999("$3[\u001e\u0014")), method3000(method2999("\u00020\u0003;P\":U\u001df\u0002\u000eU2Y*:\u0010(\u001d")), method3000(method2999("$3[\u0018\u0014")), method3000(method2999("\u00020\u0003;P\":U\u001df\u0002\u000eU9S&.\u0007?O8;\u0011zX**\u0014{")), method3000(method2999(")oG\u0005Z>2\u0019")), method3000(method2999(";oD\u0005Z>2\u0019")), method3000(method2999(";oG\u0005Z>2\u0019")), method3000(method2999("$3[\u001f\u0014")), method3000(method2999("$3[\u001b\u0014"))};
   @OriginalMember(
      owner = "client!om",
      name = "a",
      descriptor = "I"
   )
   public static int field5953;
   @OriginalMember(
      owner = "client!om",
      name = "b",
      descriptor = "I"
   )
   public static int field5955;
   @OriginalMember(
      owner = "client!om",
      name = "c",
      descriptor = "I"
   )
   public static int field5956;
   @OriginalMember(
      owner = "client!om",
      name = "e",
      descriptor = "I"
   )
   public static int field5957;
   @OriginalMember(
      owner = "client!om",
      name = "d",
      descriptor = "Ljava/util/zip/Inflater;"
   )
   private Inflater field5954;

   @OriginalMember(
      owner = "client!om",
      name = "a",
      descriptor = "()V",
      line = 9
   )
   public static final void method2994() {
      for(int var0 = 0; var0 < class87.field1060; ++var0) {
         class741 var1 = class64.field789[var0];
         class256.method1927(var1, true);
         class64.field789[var0] = null;
      }

      class87.field1060 = 0;
   }

   @OriginalMember(
      owner = "client!om",
      name = "a",
      descriptor = "(IIIIIIILln;ILln;)V",
      line = 23
   )
   public static final void method2995(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class397 arg7, int arg8, class397 arg9) {
      try {
         ++field5953;
         int var10 = arg9.method1280(-1);
         if (var10 != -1) {
            Object var11 = null;
            class396 var12 = (class396)class73.field929.method5454((long)var10, 18261);
            if (var12 == null) {
               class671[] var13 = class671.method4881(class521.field7580, var10, 0);
               if (var13 == null) {
                  return;
               }

               var12 = class786.field11439.method577(var13[0], true);
               class73.field929.method5455(-2049, var12, (long)var10);
            }

            class703.method5117(256 * arg7.method3046(-81), arg0 >> 1, arg7.field9010, arg6, arg7.field9007, 0, arg2 >> 1, 123, arg7.field9003, arg4);
            int var14 = arg1 - -class152.field1902[0] + -18;
            int var15 = arg5 - -class152.field1902[1] + -70;
            int var16 = arg3 / 4 * 18 + var14;
            int var17 = arg3 % 4 * 18 + var15;
            var12.method3035(var16, var17);
            if (arg7 == arg9) {
               class786.field11439.method637(var16 + -1, 18, -256, var17 - 1, 1, 18);
            }

            class458.method3442(var17 + 18, arg8 ^ 26322, var17 + -1, var16 - 1, var16 + 18);
            class41 var18 = class710.method5146((byte)-65);
            var18.field437 = arg9;
            var18.field439 = arg8 + var16;
            var18.field443 = var16;
            var18.field447 = var17;
            var18.field440 = var17 - -16;
            class742.field11009.method100(var18, 1);
         }
      } catch (RuntimeException var20) {
         throw class670.method4877(var20, field5958[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field5958[1] : field5958[0]) + ',' + arg8 + ',' + (arg9 != null ? field5958[1] : field5958[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!om",
      name = "<init>",
      descriptor = "()V",
      line = 70
   )
   public class392() {
      this(-1, 1000000, 1000000);
   }

   @OriginalMember(
      owner = "client!om",
      name = "a",
      descriptor = "(Ljj;I[B)V",
      line = 78
   )
   public final void method2996(class128 arg0, int arg1, byte[] arg2) {
      try {
         ++field5956;
         if (arg0.field1552[arg0.field1590] == 31 && arg0.field1552[arg0.field1590 + 1] == -117) {
            int var4 = -43 / ((25 - arg1) / 55);
            if (this.field5954 == null) {
               this.field5954 = new Inflater(true);
            }

            try {
               this.field5954.setInput(arg0.field1552, arg0.field1590 - -10, -arg0.field1590 + -18 + arg0.field1552.length);
               this.field5954.inflate(arg2);
            } catch (Exception var6) {
               this.field5954.reset();
               throw new RuntimeException(field5958[5]);
            }

            this.field5954.reset();
         } else {
            throw new RuntimeException(field5958[3]);
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field5958[4] + (arg0 != null ? field5958[1] : field5958[0]) + ',' + arg1 + ',' + (arg2 != null ? field5958[1] : field5958[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!om",
      name = "a",
      descriptor = "(ILeaa;)V",
      line = 103
   )
   public static final void method2997(int arg0, class526 arg1) {
      try {
         class87.field1058 = arg1.method3902(field5958[7], 70);
         ++field5957;
         class78.field979 = arg1.method3902(field5958[8], 86);
         class374.field5671 = arg1.method3902(field5958[6], 80);
         if (arg0 <= 100) {
            method2994();
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5958[9] + arg0 + ',' + (arg1 != null ? field5958[1] : field5958[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!om",
      name = "<init>",
      descriptor = "(III)V",
      line = 119
   )
   private class392(int arg0, int arg1, int arg2) {
   }

   @OriginalMember(
      owner = "client!om",
      name = "a",
      descriptor = "(B[B)[B",
      line = 132
   )
   public final byte[] method2998(byte arg0, byte[] arg1) {
      try {
         ++field5955;
         class128 var3 = new class128(arg1);
         var3.field1590 = arg1.length + -4;
         int var4 = var3.method1067(false);
         var3.field1590 = 0;
         if (arg0 >= -65) {
            this.method2998((byte)-42, (byte[])null);
         }

         byte[] var5 = new byte[var4];
         this.method2996(var3, 104, var5);
         return var5;
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field5958[2] + arg0 + ',' + (arg1 != null ? field5958[1] : field5958[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!om",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2999(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 60);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!om",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3000(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 75;
            break;
         case 1:
            var10005 = 94;
            break;
         case 2:
            var10005 = 117;
            break;
         case 3:
            var10005 = 90;
            break;
         default:
            var10005 = 60;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
