import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class170 extends class690 {
   @OriginalMember(
      owner = "client!aq",
      name = "r",
      descriptor = "I"
   )
   private int field2132 = -1;
   @OriginalMember(
      owner = "client!aq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2142 = new String[]{method1336(method1335("\u0010w\u001b&,")), method1336(method1335("\u001fsY\u000b")), method1336(method1335("\n(\u001bIy")), method1336(method1335("\u0010w\u001b$,")), method1336(method1335("\u0010w\u001b%,")), method1336(method1335("\u0010w\u001b#,")), method1336(method1335("\u0010w\u001b!,")), method1336(method1335("\u0010w\u001b\",")), method1336(method1335("\u0010w\u001b ,"))};
   @OriginalMember(
      owner = "client!aq",
      name = "s",
      descriptor = "B"
   )
   private byte field2138;
   @OriginalMember(
      owner = "client!aq",
      name = "t",
      descriptor = "F"
   )
   public static float field2137;
   @OriginalMember(
      owner = "client!aq",
      name = "m",
      descriptor = "I"
   )
   public static int field2133;
   @OriginalMember(
      owner = "client!aq",
      name = "q",
      descriptor = "I"
   )
   public static int field2134;
   @OriginalMember(
      owner = "client!aq",
      name = "p",
      descriptor = "I"
   )
   public static int field2135;
   @OriginalMember(
      owner = "client!aq",
      name = "v",
      descriptor = "I"
   )
   public static int field2136;
   @OriginalMember(
      owner = "client!aq",
      name = "o",
      descriptor = "I"
   )
   public static int field2140;
   @OriginalMember(
      owner = "client!aq",
      name = "u",
      descriptor = "I"
   )
   public static int field2141;
   @OriginalMember(
      owner = "client!aq",
      name = "n",
      descriptor = "Lqh;"
   )
   public static class74 field2139;

   @OriginalMember(
      owner = "client!aq",
      name = "a",
      descriptor = "(Lwm;B)V"
   )
   public final void method26(class594 arg0, byte arg1) {
      try {
         ++field2140;
         if (arg1 >= -19) {
            field2139 = null;
         }

         this.field2132 = arg0.method4280(-19104);
         this.field2138 = arg0.method4340(409855200);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field2142[5] + (arg0 != null ? field2142[2] : field2142[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aq",
      name = "a",
      descriptor = "(B[B)[B"
   )
   public static final byte[] method1330(byte arg0, byte[] arg1) {
      try {
         if (arg0 >= -37) {
            method1333(-7);
         }

         ++field2134;
         int var2 = arg1.length;
         byte[] var3 = new byte[var2];
         class714.method5200(arg1, 0, var3, 0, var2);
         return var3;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field2142[7] + arg0 + ',' + (arg1 != null ? field2142[2] : field2142[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aq",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method1331(int arg0, int arg1, int arg2) {
      try {
         ++field2136;
         int var3 = 121 / ((-14 - arg2) / 57);
         class507 var4 = class585.field8040[arg0][arg1];
         if (var4 != null) {
            class469.field6500 = var4.field7027;
            class188.field2300 = var4.field7024;
            class71.field879 = var4.field7018;
         }

         class323.method2433((byte)121);
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field2142[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aq",
      name = "c",
      descriptor = "(Z)V"
   )
   public static final void method1332(boolean arg0) {
      boolean var1 = client.field4273;

      try {
         label29: {
            if (class338.field4832.method546()) {
               label26: {
                  class338.field4832.method506(class204.field2515);
                  class449.method3330(-20052);
                  if (!class775.field11283) {
                     Dimension var2 = class204.field2515.getSize();
                     class338.field4832.method585(class204.field2515, var2.width, var2.height);
                     if (!var1) {
                        break label26;
                     }
                  }

                  class651.method4717(class204.field2515, (byte)9);
               }

               class338.field4832.method588(class204.field2515);
               if (!var1) {
                  break label29;
               }
            }

            class594.method4335(false, Integer.MAX_VALUE, class674.field9907.field8451.method2770((byte)-122));
         }

         ++field2141;
         class570.method4093(-30624);
         if (!arg0) {
            class591.field8180 = true;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field2142[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aq",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method1333(int arg0) {
      try {
         ++field2133;
         if (arg0 != -30690) {
            method1333(-4);
         }

         for(int var1 = 0; var1 < class100.field1295.length; ++var1) {
            for(int var2 = 0; ~class100.field1295[0].length < ~var2; ++var2) {
               for(int var3 = 0; class100.field1295[0][0].length > var3; ++var3) {
                  class100.field1295[var1][var2][var3] = 0;
               }
            }
         }

      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field2142[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aq",
      name = "a",
      descriptor = "(ZLhh;)V"
   )
   public final void method27(boolean arg0, class139 arg1) {
      try {
         ++field2135;
         if (arg0) {
            field2139 = null;
         }

         arg1.method1185(this.field2132, -112, this.field2138);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field2142[3] + arg0 + ',' + (arg1 != null ? field2142[2] : field2142[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aq",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1334(int arg0) {
      try {
         if (arg0 != 0) {
            field2137 = -0.39598668F;
         }

         field2139 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2142[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1335(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 4);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1336(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 113;
            break;
         case 1:
            var10005 = 6;
            break;
         case 2:
            var10005 = 53;
            break;
         case 3:
            var10005 = 103;
            break;
         default:
            var10005 = 4;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
