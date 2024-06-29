import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cia")
public class class643 extends class770 {
   @OriginalMember(
      owner = "client!cia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9035 = new String[]{method4645(method4644(":SYllq")), method4645(method4644(":SYloq")), method4645(method4644(":SYlnq")), method4645(method4644(":SYlmq"))};
   @OriginalMember(
      owner = "client!cia",
      name = "j",
      descriptor = "I"
   )
   public static int field9027 = 0;
   @OriginalMember(
      owner = "client!cia",
      name = "k",
      descriptor = "[F"
   )
   public static float[] field9033 = new float[]{0.0F, -1.0F, 0.0F, 0.0F};
   @OriginalMember(
      owner = "client!cia",
      name = "f",
      descriptor = "I"
   )
   public static int field9029;
   @OriginalMember(
      owner = "client!cia",
      name = "i",
      descriptor = "I"
   )
   public static int field9030;
   @OriginalMember(
      owner = "client!cia",
      name = "l",
      descriptor = "I"
   )
   public static int field9031;
   @OriginalMember(
      owner = "client!cia",
      name = "h",
      descriptor = "J"
   )
   public static long field9028;
   @OriginalMember(
      owner = "client!cia",
      name = "m",
      descriptor = "Lcia;"
   )
   public class643 field9032;
   @OriginalMember(
      owner = "client!cia",
      name = "g",
      descriptor = "Lcia;"
   )
   public class643 field9034;

   @OriginalMember(
      owner = "client!cia",
      name = "a",
      descriptor = "(B)I"
   )
   public static final int method4640(byte arg0) {
      try {
         if (arg0 != 106) {
            field9028 = 104L;
         }

         ++field9029;
         return class766.field11046;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9035[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method4641(int arg0) {
      try {
         field9033 = null;
         if (arg0 < 91) {
            field9027 = 64;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9035[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method4642(int arg0) {
      try {
         ++field9031;
         if (this.field9032 != null) {
            this.field9032.field9034 = this.field9034;
            this.field9034.field9032 = this.field9032;
            this.field9034 = null;
            this.field9032 = null;
            if (arg0 < 16) {
               method4640((byte)-59);
            }
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9035[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method4643(int arg0) {
      boolean var1 = client.field4273;

      try {
         label32: {
            int var2 = -102 % ((arg0 - -28) / 35);
            ++field9030;
            int var3 = class674.field9907.field8421.method4193((byte)-113);
            if (~var3 == -1) {
               class737.field10749 = null;
               class111.method975(0, 0);
               if (!var1) {
                  break label32;
               }
            }

            if (var3 != 1) {
               class146.method1233((byte)(255 & class766.field11053 - 4), 0);
               class111.method975(0, 2);
               if (!var1) {
                  break label32;
               }
            }

            class146.method1233((byte)0, 0);
            class111.method975(0, 512);
            if (class100.field1295 != null) {
               class279.method2119(3432);
            }
         }

         class501.field6882 = class239.field2981;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field9035[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4644(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 36);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4645(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 89;
            break;
         case 1:
            var10005 = 58;
            break;
         case 2:
            var10005 = 56;
            break;
         case 3:
            var10005 = 66;
            break;
         default:
            var10005 = 36;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
