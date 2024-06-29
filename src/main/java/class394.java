import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gka")
public class class394 implements class180 {
   @OriginalMember(
      owner = "client!gka",
      name = "e",
      descriptor = "I"
   )
   public int field5560;
   @OriginalMember(
      owner = "client!gka",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5567 = new String[]{method3004(method3003("I*\u001bX\u0004\u0006")), method3004(method3003("I*\u001bX{G/\u0013\u0002y\u0006")), method3004(method3003("UoTX:")), method3004(method3003("@4\u0016\u001a")), method3004(method3003("I*\u001bX\u0005\u0006")), method3004(method3003("I*\u001bX\u0006\u0006")), method3004(method3003("I*\u001bX3A\u0012\u000e\u0004.@&R"))};
   @OriginalMember(
      owner = "client!gka",
      name = "c",
      descriptor = "[B"
   )
   public static byte[] field5562 = new byte[2048];
   @OriginalMember(
      owner = "client!gka",
      name = "g",
      descriptor = "J"
   )
   public static volatile long field5564 = 0L;
   @OriginalMember(
      owner = "client!gka",
      name = "f",
      descriptor = "I"
   )
   public static int field5561;
   @OriginalMember(
      owner = "client!gka",
      name = "d",
      descriptor = "I"
   )
   public static int field5565;
   @OriginalMember(
      owner = "client!gka",
      name = "a",
      descriptor = "I"
   )
   public static int field5566;
   @OriginalMember(
      owner = "client!gka",
      name = "b",
      descriptor = "[Lrp;"
   )
   public static class464[] field5563;

   @OriginalMember(
      owner = "client!gka",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2999(int arg0) {
      try {
         if (arg0 != 255) {
            method3001(-59, -11, -23, (class95)null, (class95)null);
         }

         field5563 = null;
         field5562 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5567[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gka",
      name = "a",
      descriptor = "(IB)Z"
   )
   public static final boolean method3000(int arg0, byte arg1) {
      try {
         ++field5561;
         if (arg0 <= 117) {
            method2999(93);
         }

         int var2 = 255 & arg1;
         if (~var2 == -1) {
            return false;
         } else {
            return ~var2 > -129 || var2 >= 160 || class79.field989[var2 - 128] != 0;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field5567[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gka",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field5565;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5567[6] + ')');
      }
   }

   @OriginalMember(
      owner = "client!gka",
      name = "a",
      descriptor = "(IIILiia;Liia;)V"
   )
   public static final void method3001(int arg0, int arg1, int arg2, class95 arg3, class95 arg4) {
      class225 var5 = class12.method96(arg0, arg1, arg2);
      if (var5 != null) {
         var5.field2824 = arg3;
         var5.field2822 = arg4;
         int var6 = class93.field1241 == class73.field900 ? 1 : 0;
         if (arg3.method780(73)) {
            if (arg3.method775(0)) {
               arg3.field1004 = class735.field10736[var6];
               class735.field10736[var6] = arg3;
            } else {
               arg3.field1004 = class8.field111[var6];
               class8.field111[var6] = arg3;
               class591.field8180 = true;
            }
         } else {
            arg3.field1004 = class234.field2900[var6];
            class234.field2900[var6] = arg3;
         }

         if (arg4 != null) {
            if (arg4.method780(85)) {
               if (arg4.method775(0)) {
                  arg4.field1004 = class735.field10736[var6];
                  class735.field10736[var6] = arg4;
                  return;
               }

               arg4.field1004 = class8.field111[var6];
               class8.field111[var6] = arg4;
               class591.field8180 = true;
               return;
            }

            arg4.field1004 = class234.field2900[var6];
            class234.field2900[var6] = arg4;
         }
      }

   }

   @OriginalMember(
      owner = "client!gka",
      name = "a",
      descriptor = "(IIII)V"
   )
   public static final void method3002(int arg0, int arg1, int arg2, int arg3) {
      try {
         if (arg1 != -24073) {
            method3002(79, -22, -113, -37);
         }

         label43: {
            ++field5566;
            int var6 = class674.field9907.field8422.method5190((byte)-62) * arg3 >> 8;
            if (arg2 == -1 && !class694.field10136) {
               class591.method4256(1);
               if (!client.field4273) {
                  break label43;
               }
            }

            if (~arg2 != 0 && (class215.field2664 != arg2 || !class595.method4345(false)) && var6 != 0 && !class694.field10136) {
               class640.method4635(arg2, var6, arg0, false, 0, class590.field8143, (byte)96);
               class191.method1437((byte)-110);
            }
         }

         if (~class215.field2664 != ~arg2) {
            class33.field391 = null;
         }

         class215.field2664 = arg2;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field5567[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gka",
      name = "<init>",
      descriptor = "(Ljava/lang/String;I)V"
   )
   public class394(String arg0, int arg1) {
      try {
         this.field5560 = arg1;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field5567[1] + (arg0 != null ? field5567[2] : field5567[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3003(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 71);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3004(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 46;
            break;
         case 1:
            var10005 = 65;
            break;
         case 2:
            var10005 = 122;
            break;
         case 3:
            var10005 = 118;
            break;
         default:
            var10005 = 71;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
