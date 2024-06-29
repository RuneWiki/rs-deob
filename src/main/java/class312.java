import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class312 {
   @OriginalMember(
      owner = "client!hs",
      name = "i",
      descriptor = "B"
   )
   public byte field4687;
   @OriginalMember(
      owner = "client!hs",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4691 = new String[]{method2548(method2547("x\u0015\u0007\u001d0~\u000f]\u001fq")), method2548(method2547("x\u0015\u0007`q")), method2548(method2547("x\u0015\u0007cq")), method2548(method2547("x\u0015\u0007bq"))};
   @OriginalMember(
      owner = "client!hs",
      name = "m",
      descriptor = "I"
   )
   public static int field4676 = -1;
   @OriginalMember(
      owner = "client!hs",
      name = "f",
      descriptor = "I"
   )
   public static int field4674;
   @OriginalMember(
      owner = "client!hs",
      name = "n",
      descriptor = "I"
   )
   public static int field4686;
   @OriginalMember(
      owner = "client!hs",
      name = "c",
      descriptor = "Lma;"
   )
   public static class148 field4675;
   @OriginalMember(
      owner = "client!hs",
      name = "b",
      descriptor = "Lft;"
   )
   public class188 field4680;
   @OriginalMember(
      owner = "client!hs",
      name = "l",
      descriptor = "Lhs;"
   )
   public class312 field4685;
   @OriginalMember(
      owner = "client!hs",
      name = "h",
      descriptor = "Lnu;"
   )
   public class349 field4677;
   @OriginalMember(
      owner = "client!hs",
      name = "g",
      descriptor = "Ljf;"
   )
   public class565 field4688;
   @OriginalMember(
      owner = "client!hs",
      name = "o",
      descriptor = "Ljf;"
   )
   public class565 field4689;
   @OriginalMember(
      owner = "client!hs",
      name = "j",
      descriptor = "Lwaa;"
   )
   public class566 field4679;
   @OriginalMember(
      owner = "client!hs",
      name = "a",
      descriptor = "Lwaa;"
   )
   public class566 field4690;
   @OriginalMember(
      owner = "client!hs",
      name = "p",
      descriptor = "Lqu;"
   )
   public class84 field4678;
   @OriginalMember(
      owner = "client!hs",
      name = "q",
      descriptor = "S"
   )
   public short field4681;
   @OriginalMember(
      owner = "client!hs",
      name = "d",
      descriptor = "S"
   )
   public short field4682;
   @OriginalMember(
      owner = "client!hs",
      name = "k",
      descriptor = "S"
   )
   public short field4683;
   @OriginalMember(
      owner = "client!hs",
      name = "e",
      descriptor = "S"
   )
   public short field4684;

   @OriginalMember(
      owner = "client!hs",
      name = "b",
      descriptor = "(I)I"
   )
   public static final int method2544(int arg0) {
      boolean var1 = client.field10022;

      try {
         byte var3;
         label40: {
            ++field4674;
            if (~class654.field9274 <= -97) {
               int var2 = class543.method4050(arg0 + 119);
               if (var2 <= 100) {
                  var3 = 4;
                  class664.method4828(true);
                  if (!var1) {
                     break label40;
                  }
               }

               if (var2 <= 500) {
                  class156.method1491(1);
                  var3 = 3;
                  if (!var1) {
                     break label40;
                  }
               }

               if (~var2 < -1001) {
                  class194.method1708(true, 0);
                  var3 = 1;
                  if (!var1) {
                     break label40;
                  }
               }

               var3 = 2;
               class542.method4042(0);
               if (!var1) {
                  break label40;
               }
            }

            var3 = 1;
            class194.method1708(true, 0);
         }

         if (arg0 != 1) {
            method2544(12);
         }

         if (~class476.field6870.field9109.method4676(-59) != -1) {
            class476.field6870.method4707(0, false, class476.field6870.field9103);
            class508.method3828(arg0, false, 0);
         }

         class737.method5332(0);
         return var3;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field4691[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hs",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method2545(int arg0) {
      try {
         if (arg0 == 0) {
            while(this.field4678 != null) {
               class84 var2 = this.field4678.field1305;
               this.field4678.method890(26325);
               this.field4678 = var2;
            }

            ++field4686;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field4691[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hs",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2546(byte arg0) {
      try {
         field4675 = null;
         if (arg0 != -25) {
            method2544(97);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field4691[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hs",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class312(int arg0) {
      try {
         this.field4687 = (byte)arg0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field4691[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hs",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2547(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 89);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hs",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2548(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 16;
            break;
         case 1:
            var10005 = 102;
            break;
         case 2:
            var10005 = 41;
            break;
         case 3:
            var10005 = 33;
            break;
         default:
            var10005 = 89;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
