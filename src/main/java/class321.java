import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class321 extends class644 {
   @OriginalMember(
      owner = "client!jr",
      name = "s",
      descriptor = "I"
   )
   private int field4412 = -1;
   @OriginalMember(
      owner = "client!jr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4414 = new String[]{method2528(method2527("\n\u0007f$\u000f")), method2528(method2527("\u000e\u0000$\u000b")), method2528(method2527("\u001b[fIZ")), method2528(method2527("\n\u0007f\"\u000f")), method2528(method2527("\n\u0007f%\u000f")), method2528(method2527("\n\u0007f&\u000f"))};
   @OriginalMember(
      owner = "client!jr",
      name = "t",
      descriptor = "Lsia;"
   )
   public static class407 field4410 = new class407(8);
   @OriginalMember(
      owner = "client!jr",
      name = "v",
      descriptor = "I"
   )
   public static int field4409;
   @OriginalMember(
      owner = "client!jr",
      name = "w",
      descriptor = "I"
   )
   public static int field4411;
   @OriginalMember(
      owner = "client!jr",
      name = "u",
      descriptor = "I"
   )
   public static int field4413;

   @OriginalMember(
      owner = "client!jr",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method2525(boolean arg0) {
      try {
         if (!arg0) {
            field4410 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field4414[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jr",
      name = "a",
      descriptor = "(ILgea;)V"
   )
   public final void method111(int arg0, class66 arg1) {
      try {
         ++field4413;
         if (arg0 != 11) {
            this.field4412 = -119;
         }

         this.field4412 = arg1.method603(arg0 ^ -11);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field4414[3] + arg0 + ',' + (arg1 != null ? field4414[2] : field4414[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jr",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method2526(int arg0) {
      try {
         ++field4409;
         if (class597.field8823) {
            class642 var1 = class77.method737(-16985, class26.field392, class371.field5188);
            if (arg0 != 27352) {
               method2526(-108);
            }

            if (var1 != null && var1.field9576 != null) {
               class586 var2 = new class586();
               var2.field8655 = var1;
               var2.field8648 = var1.field9576;
               class256.method2064(var2);
            }

            class436.field5949 = -1;
            class226.field2826 = -1;
            class597.field8823 = false;
            if (var1 != null) {
               class49.method372(var1, 0);
            }
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field4414[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jr",
      name = "a",
      descriptor = "(ILkd;)V"
   )
   public final void method114(int arg0, class790 arg1) {
      try {
         ++field4411;
         if (arg0 != 19163) {
            field4410 = null;
         }

         arg1.method5701(-6039, this.field4412);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field4414[4] + arg0 + ',' + (arg1 != null ? field4414[2] : field4414[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2527(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 39);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2528(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 96;
            break;
         case 1:
            var10005 = 117;
            break;
         case 2:
            var10005 = 72;
            break;
         case 3:
            var10005 = 103;
            break;
         default:
            var10005 = 39;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
