import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class749 {
   @OriginalMember(
      owner = "client!gk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10651 = new String[]{method5392(method5391("1Q\u0014\u0007p/W\u0011\u0001")), method5392(method5391(";SY47")), method5392(method5391("2M\u001b\u0019")), method5392(method5391("'\u0016Y[b")), method5392(method5391(";SY77")), method5392(method5391(";SY67")), method5392(method5391("3H\u0012\u001bu/"))};
   @OriginalMember(
      owner = "client!gk",
      name = "d",
      descriptor = "I"
   )
   public static int field10650 = 0;
   @OriginalMember(
      owner = "client!gk",
      name = "g",
      descriptor = "I"
   )
   public int field10643;
   @OriginalMember(
      owner = "client!gk",
      name = "c",
      descriptor = "I"
   )
   public static int field10644;
   @OriginalMember(
      owner = "client!gk",
      name = "e",
      descriptor = "I"
   )
   public static int field10645;
   @OriginalMember(
      owner = "client!gk",
      name = "h",
      descriptor = "I"
   )
   public int field10646;
   @OriginalMember(
      owner = "client!gk",
      name = "a",
      descriptor = "I"
   )
   public static int field10647;
   @OriginalMember(
      owner = "client!gk",
      name = "b",
      descriptor = "I"
   )
   public int field10648;
   @OriginalMember(
      owner = "client!gk",
      name = "f",
      descriptor = "I"
   )
   public int field10649;

   @OriginalMember(
      owner = "client!gk",
      name = "a",
      descriptor = "(ILfea;Ljava/lang/String;B)Ldu;"
   )
   public static final class92 method5388(int arg0, class82 arg1, String arg2, byte arg3) {
      try {
         ++field10645;
         if (arg3 < 72) {
            field10650 = 121;
         }

         return class76.method842(arg1, field10651[6], arg0, (byte)122, arg2);
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field10651[5] + arg0 + ',' + (arg1 != null ? field10651[3] : field10651[2]) + ',' + (arg2 != null ? field10651[3] : field10651[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gk",
      name = "a",
      descriptor = "(ILkaa;)V"
   )
   public static final void method5389(int arg0, class158 arg1) {
      try {
         if (arg0 == 19686) {
            ++field10644;
            class268 var2 = (class268)class639.field9022.method3101(-1, (long)arg1.field5826);
            if (var2 != null) {
               if (var2.field4092 != null) {
                  class129.field2068.method557(var2.field4092);
                  var2.field4092 = null;
               }

               var2.method2140((byte)124);
            }
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field10651[4] + arg0 + ',' + (arg1 != null ? field10651[3] : field10651[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gk",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method5390(int arg0) {
      boolean var1 = client.field10022;

      try {
         if (arg0 != 21879) {
            method5389(19, (class158)null);
         }

         label36: {
            if (~class82.field1284.toLowerCase().indexOf(field10651[0]) != 0) {
               class88.field1314[222] = 59;
               class88.field1314[189] = 26;
               class88.field1314[187] = 27;
               class88.field1314[220] = 74;
               class88.field1314[221] = 43;
               class88.field1314[186] = 57;
               class88.field1314[223] = 28;
               class88.field1314[219] = 42;
               class88.field1314[192] = 58;
               class88.field1314[191] = 73;
               class88.field1314[190] = 72;
               class88.field1314[188] = 71;
               if (!var1) {
                  break label36;
               }
            }

            label25: {
               class88.field1314[92] = 74;
               class88.field1314[45] = 26;
               class88.field1314[91] = 42;
               class88.field1314[61] = 27;
               class88.field1314[46] = 72;
               class88.field1314[47] = 73;
               if (class82.field1273 != null) {
                  class88.field1314[222] = 58;
                  class88.field1314[192] = 28;
                  class88.field1314[520] = 59;
                  if (!var1) {
                     break label25;
                  }
               }

               class88.field1314[192] = 58;
               class88.field1314[222] = 59;
            }

            class88.field1314[44] = 71;
            class88.field1314[59] = 57;
            class88.field1314[93] = 43;
         }

         ++field10647;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10651[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5391(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 31);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5392(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 92;
            break;
         case 1:
            var10005 = 56;
            break;
         case 2:
            var10005 = 119;
            break;
         case 3:
            var10005 = 117;
            break;
         default:
            var10005 = 31;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
