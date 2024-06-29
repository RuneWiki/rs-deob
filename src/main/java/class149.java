import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class149 extends InputStream {
   @OriginalMember(
      owner = "client!ls",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2399 = new String[]{method1393(method1392("wU\u0013)M")), method1393(method1392("`\b\u0013C\u0018")), method1393(method1392("b\u000eQk")), method1393(method1392("`\b\u0013F\u0018")), method1393(method1392("`\b\u0013uUm\u001f\u0015")), method1393(method1392("`\b\u0013E\u0018")), method1393(method1392("`\b\u0013D\u0018"))};
   @OriginalMember(
      owner = "client!ls",
      name = "d",
      descriptor = "I"
   )
   public static int field2394 = -50;
   @OriginalMember(
      owner = "client!ls",
      name = "f",
      descriptor = "I"
   )
   public static int field2397 = -1;
   @OriginalMember(
      owner = "client!ls",
      name = "e",
      descriptor = "I"
   )
   public static int field2392;
   @OriginalMember(
      owner = "client!ls",
      name = "c",
      descriptor = "I"
   )
   public static int field2393;
   @OriginalMember(
      owner = "client!ls",
      name = "b",
      descriptor = "I"
   )
   public static int field2395;
   @OriginalMember(
      owner = "client!ls",
      name = "g",
      descriptor = "I"
   )
   public static int field2396;
   @OriginalMember(
      owner = "client!ls",
      name = "a",
      descriptor = "I"
   )
   public static int field2398;

   @OriginalMember(
      owner = "client!ls",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method1388(int arg0, int arg1) {
      try {
         label16: {
            if (class203.field3034 != arg1) {
               class435.field6292 = arg0;
               if (!client.field4564) {
                  break label16;
               }
            }

            class657.field9595.method4321(arg0, (byte)108);
         }

         ++field2396;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2399[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ls",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method1389(boolean arg0) {
      try {
         if (arg0) {
            field2397 = -6;
         }

         class583.method4327(-10073);
         ++field2393;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2399[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ls",
      name = "a",
      descriptor = "(Lsb;Lsb;I)V"
   )
   public static final void method1390(class305 arg0, class305 arg1, int arg2) {
      try {
         if (arg0.field4408 != null) {
            arg0.method2385(117);
         }

         ++field2395;
         arg0.field4412 = arg1.field4412;
         arg0.field4408 = arg1;
         arg0.field4408.field4412 = arg0;
         if (arg2 != -16940) {
            method1389(true);
         }

         arg0.field4412.field4408 = arg0;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2399[1] + (arg0 != null ? field2399[0] : field2399[2]) + ',' + (arg1 != null ? field2399[0] : field2399[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ls",
      name = "read",
      descriptor = "()I"
   )
   public final int read() {
      try {
         ++field2392;
         class624.method4569((byte)98, 30000L);
         return -1;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2399[4] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ls",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method1391(int arg0) {
      try {
         ++field2398;
         class490.field7150.method3093((byte)98);
         class61.method668(false);
         class641.field9351 = 0;
         class572.field8267 = null;
         class346.field4923.field6907 = 0;
         class25.field388 = 0;
         class640.field9321 = null;
         if (arg0 <= 5) {
            field2394 = 90;
         }

         class787.field11520 = null;
         class504.method3788((byte)105);
         class205.field3063 = 0;
         class582.field8420 = 0;
         class690.field10137 = null;
         class511.field7466 = null;
         class87.field1426 = null;
         class740.field10663 = null;
         class128.field2146 = 0;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2399[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ls",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1392(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 48);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ls",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1393(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 12;
            break;
         case 1:
            var10005 = 123;
            break;
         case 2:
            var10005 = 61;
            break;
         case 3:
            var10005 = 7;
            break;
         default:
            var10005 = 48;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
