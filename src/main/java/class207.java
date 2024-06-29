import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public abstract class class207 extends class347 {
   @OriginalMember(
      owner = "client!tj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2649 = new String[]{method1584(method1583("D\tUeX")), method1584(method1583("D\tUdX")), method1584(method1583("D\tUfX")), method1584(method1583("D\tUkX")), method1584(method1583("KMU\u0002\r")), method1584(method1583("^\u0016\u0017@"))};
   @OriginalMember(
      owner = "client!tj",
      name = "m",
      descriptor = "Lsd;"
   )
   public static class101 field2648 = new class101(26, -2);
   @OriginalMember(
      owner = "client!tj",
      name = "k",
      descriptor = "I"
   )
   public static int field2644;
   @OriginalMember(
      owner = "client!tj",
      name = "j",
      descriptor = "I"
   )
   public static int field2645;
   @OriginalMember(
      owner = "client!tj",
      name = "l",
      descriptor = "I"
   )
   public static int field2646;
   @OriginalMember(
      owner = "client!tj",
      name = "i",
      descriptor = "I"
   )
   public static int field2647;

   @OriginalMember(
      owner = "client!tj",
      name = "a",
      descriptor = "(Lhv;IIB)V",
      line = 9
   )
   public static final void method1579(class544 arg0, int arg1, int arg2, byte arg3) {
      try {
         ++field2645;
         class512 var4 = arg0.method4025(15, class786.field11439);
         if (var4 != null) {
            if (arg3 < 35) {
               method1581(68);
            }

            class786.field11439.method554(arg2, arg1, arg0.field7986 + arg2, arg1 - -arg0.field7954);
            if (~class134.field1686 <= -4) {
               class786.field11439.method636(-16777216, var4, arg2, arg1);
            } else {
               class744.field11042.method3038((float)arg0.field7986 / 2.0F + (float)arg2, (float)arg0.field7954 / 2.0F + (float)arg1, 4096, ((int)(-class56.field706) & 16383) << 2, var4, arg2, arg1);
            }
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field2649[3] + (arg0 != null ? field2649[4] : field2649[5]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "b",
      descriptor = "(III)Z",
      line = 32
   )
   public static final boolean method1580(int arg0, int arg1, int arg2) {
      try {
         if (arg1 != -6421) {
            method1579((class544)null, 119, 54, (byte)-76);
         }

         ++field2644;
         return (52 & arg2) != 0;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field2649[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "a",
      descriptor = "(I)V",
      line = 49
   )
   public static void method1581(int arg0) {
      try {
         field2648 = null;
         if (arg0 != 8336) {
            method1580(-49, 25, 17);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field2649[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "a",
      descriptor = "(BZ)V",
      line = 62
   )
   public static final void method1582(byte arg0, boolean arg1) {
      int var2 = client.field4530;

      try {
         ++class109.field1336;
         ++field2646;
         if (arg0 == -44) {
            class180 var3 = class486.method3603(class766.field11247, (byte)-114, class48.field583);
            class763.method5527(false, var3);
            class624 var4 = (class624)class573.field8525.method5677((byte)44);
            if (var2 != 0) {
               if (!var4.method2716(0)) {
                  var4 = (class624)class573.field8525.method5677((byte)44);
                  if (var4 == null && var2 == 0 && var2 == 0) {
                     if (class458.field6935 != null) {
                        class140.method1188(class458.field6935, (byte)-108);
                        class458.field6935 = null;
                        return;
                     }

                     return;
                  }
               }

               if (var4.field9086 == 0) {
                  class217.method1640(var4, (byte)17, true, arg1);
               }

               var4 = (class624)class573.field8525.method5671(44);
            }

            while(true) {
               while(var4 != null) {
                  if (!var4.method2716(0)) {
                     var4 = (class624)class573.field8525.method5677((byte)44);
                     if (var4 == null && var2 == 0 && var2 == 0) {
                        if (class458.field6935 != null) {
                           class140.method1188(class458.field6935, (byte)-108);
                           class458.field6935 = null;
                           return;
                        }

                        return;
                     }
                  }

                  if (var4.field9086 == 0) {
                     class217.method1640(var4, (byte)17, true, arg1);
                  }

                  var4 = (class624)class573.field8525.method5671(44);
               }

               if (var2 == 0) {
                  if (class458.field6935 != null) {
                     class140.method1188(class458.field6935, (byte)-108);
                     class458.field6935 = null;
                     return;
                  }

                  return;
               }

               if (var4.field9086 == 0) {
                  class217.method1640(var4, (byte)17, true, arg1);
               }

               var4 = (class624)class573.field8525.method5671(44);
            }
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field2649[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "a",
      descriptor = "(Lfa;Z)V"
   )
   public abstract void method791(class244 arg0, boolean arg1);

   @OriginalMember(
      owner = "client!tj",
      name = "a",
      descriptor = "(Ljj;Z)V"
   )
   public abstract void method793(class128 arg0, boolean arg1);

   @OriginalMember(
      owner = "client!tj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1583(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 112);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1584(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 48;
            break;
         case 1:
            var10005 = 99;
            break;
         case 2:
            var10005 = 123;
            break;
         case 3:
            var10005 = 44;
            break;
         default:
            var10005 = 112;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
