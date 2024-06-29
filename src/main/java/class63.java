import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public class class63 extends class604 {
   @OriginalMember(
      owner = "client!fw",
      name = "m",
      descriptor = "I"
   )
   public int field777;
   @OriginalMember(
      owner = "client!fw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field784 = new String[]{method524(method523("\u0013@w/\u0003")), method524(method523("\u0013@w.\u0003")), method524(method523("\u0013@w-\u0003")), method524(method523("\u000e\u0019wBV")), method524(method523("\u001bB5\u0000")), method524(method523("\u001e[")), method524(method523("\u0013@w(\u0003")), method524(method523("\u0013@wPB\u001b^-R\u0003"))};
   @OriginalMember(
      owner = "client!fw",
      name = "l",
      descriptor = "Lhn;"
   )
   public static class751 field779 = new class751(10, 7);
   @OriginalMember(
      owner = "client!fw",
      name = "i",
      descriptor = "J"
   )
   public static long field782 = 20000000L;
   @OriginalMember(
      owner = "client!fw",
      name = "j",
      descriptor = "I"
   )
   public static int field778;
   @OriginalMember(
      owner = "client!fw",
      name = "o",
      descriptor = "I"
   )
   public static int field780;
   @OriginalMember(
      owner = "client!fw",
      name = "k",
      descriptor = "I"
   )
   public static int field781;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!fw",
      name = "n",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field783;

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!fw",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;",
      line = 1
   )
   public static Class method522(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!fw",
      name = "<init>",
      descriptor = "(I)V",
      line = 3
   )
   public class63(int arg0) {
      try {
         this.field777 = arg0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field784[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fw",
      name = "a",
      descriptor = "(ZLku;)V",
      line = 14
   )
   public static final void method518(boolean arg0, class395 arg1) {
      try {
         ++field781;
         if (class353.field5360 != null) {
            class86 var2 = null;
            if (~arg1.field6006 == -1) {
               var2 = (class86)class29.method203(arg1.field6007, arg1.field6011, arg1.field6010);
            }

            if (arg1.field6006 == 1) {
               var2 = (class86)class746.method5435(arg1.field6007, arg1.field6011, arg1.field6010);
            }

            if (~arg1.field6006 == -3) {
               var2 = (class86)class660.method4742(arg1.field6007, arg1.field6011, arg1.field6010, field783 != null ? field783 : (field783 = method522(field784[5])));
            }

            if (arg0) {
               field779 = null;
            }

            if (~arg1.field6006 == -4) {
               var2 = (class86)class97.method856(arg1.field6007, arg1.field6011, arg1.field6010);
            }

            if (var2 != null) {
               arg1.field6009 = var2.method350(25061);
               arg1.field6003 = var2.method355(-29081);
               arg1.field6001 = var2.method358(110);
            } else {
               arg1.field6001 = 0;
               arg1.field6003 = 0;
               arg1.field6009 = -1;
            }
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field784[6] + arg0 + ',' + (arg1 != null ? field784[3] : field784[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fw",
      name = "a",
      descriptor = "(I)Z",
      line = 56
   )
   public static final boolean method519(int arg0) {
      try {
         class278.field3884 = true;
         ++class744.field11043;
         if (arg0 != 0) {
            return false;
         } else {
            ++field778;
            return true;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field784[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fw",
      name = "a",
      descriptor = "(BLjfa;)Ljava/lang/String;",
      line = 69
   )
   public static final String method520(byte arg0, class303 arg1) {
      try {
         ++field780;
         if (arg0 >= -2) {
            method520((byte)-80, (class303)null);
         }

         if (arg1.field4320 != null && ~arg1.field4320.length() != -1) {
            return arg1.field4318 != null && ~arg1.field4318.length() < -1 ? arg1.field4323 + class204.field2596.method1562((byte)-106, class728.field10827) + arg1.field4318 + class204.field2596.method1562((byte)-85, class728.field10827) + arg1.field4320 : arg1.field4323 + class204.field2596.method1562((byte)-127, class728.field10827) + arg1.field4320;
         } else {
            return arg1.field4318 != null && arg1.field4318.length() > 0 ? arg1.field4323 + class204.field2596.method1562((byte)-89, class728.field10827) + arg1.field4318 : arg1.field4323;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field784[2] + arg0 + ',' + (arg1 != null ? field784[3] : field784[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fw",
      name = "c",
      descriptor = "(B)V",
      line = 102
   )
   public static void method521(byte arg0) {
      try {
         field779 = null;
         if (arg0 >= -89) {
            field782 = 100L;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field784[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method523(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 43);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method524(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 117;
            break;
         case 1:
            var10005 = 55;
            break;
         case 2:
            var10005 = 89;
            break;
         case 3:
            var10005 = 108;
            break;
         default:
            var10005 = 43;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
