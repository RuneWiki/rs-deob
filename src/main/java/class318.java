import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class318 {
   @OriginalMember(
      owner = "client!ft",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4386 = new String[]{method2517(method2516("\u0011\u0015r',")), method2517(method2516("\u0004N0e")), method2517(method2516("\fOrKy")), method2517(method2516("\fOrJy")), method2517(method2516("\fOrLy")), method2517(method2516("\fOrHy"))};
   @OriginalMember(
      owner = "client!ft",
      name = "f",
      descriptor = "Lvv;"
   )
   public static class467 field4380 = new class467();
   @OriginalMember(
      owner = "client!ft",
      name = "b",
      descriptor = "I"
   )
   public static int field4381;
   @OriginalMember(
      owner = "client!ft",
      name = "d",
      descriptor = "I"
   )
   public static int field4382;
   @OriginalMember(
      owner = "client!ft",
      name = "e",
      descriptor = "I"
   )
   public static int field4383;
   @OriginalMember(
      owner = "client!ft",
      name = "c",
      descriptor = "I"
   )
   public static int field4384;
   @OriginalMember(
      owner = "client!ft",
      name = "a",
      descriptor = "I"
   )
   public static int field4385;

   @OriginalMember(
      owner = "client!ft",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2511(int arg0) {
      try {
         if (arg0 > -78) {
            method2515(-74, 104, 7, 123, (class488)null);
         }

         field4380 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field4386[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ft",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method2512(boolean arg0) {
      boolean var1 = client.field1481;

      try {
         if (arg0) {
            method2513(-2, (String[])null, -50, -10, (int[])null);
         }

         if (class44.field572 != null) {
            class196[] var2 = class44.field572;
            int var3 = 0;
            class196 var4;
            if (var1) {
               var4 = var2[var3];
               var4.method1635((byte)67);
               ++var3;
            }

            while(~var3 > ~var2.length) {
               var4 = var2[var3];
               var4.method1635((byte)67);
               ++var3;
            }
         }

         ++field4381;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field4386[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ft",
      name = "a",
      descriptor = "(I[Ljava/lang/String;II[I)V"
   )
   public static final void method2513(int param0, String[] param1, int param2, int param3, int[] param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ft",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method2514(int arg0) {
      try {
         class328.method2606((byte)-97, 255, -1);
         ++field4382;
         if (arg0 <= 54) {
            method2512(false);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field4386[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ft",
      name = "a",
      descriptor = "(IIIILdi;)V"
   )
   public static final void method2515(int arg0, int arg1, int arg2, int arg3, class488 arg4) {
      class731 var5 = class254.method2039(arg0, arg1, arg2);
      if (var5 != null) {
         arg4.field10467 = (arg1 << class783.field11447) + class486.field6788;
         arg4.field10466 = arg3;
         arg4.field10468 = (arg2 << class783.field11447) + class486.field6788;
         var5.field10644 = arg4;
         int var6 = class659.field9815 == class569.field8364 ? 1 : 0;
         if (arg4.method69((byte)123)) {
            if (arg4.method67(703)) {
               arg4.field10469 = class217.field2753[var6];
               class217.field2753[var6] = arg4;
               return;
            }

            arg4.field10469 = class127.field1637[var6];
            class127.field1637[var6] = arg4;
            class323.field4420 = true;
            return;
         }

         arg4.field10469 = class500.field6970[var6];
         class500.field6970[var6] = arg4;
      }

   }

   @OriginalMember(
      owner = "client!ft",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2516(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 81);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ft",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2517(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 106;
            break;
         case 1:
            var10005 = 59;
            break;
         case 2:
            var10005 = 92;
            break;
         case 3:
            var10005 = 9;
            break;
         default:
            var10005 = 81;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
