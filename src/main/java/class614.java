import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kea")
public class class614 extends class673 {
   @OriginalMember(
      owner = "client!kea",
      name = "x",
      descriptor = "Z"
   )
   public boolean field9038 = true;
   @OriginalMember(
      owner = "client!kea",
      name = "y",
      descriptor = "Z"
   )
   public boolean field9036 = false;
   @OriginalMember(
      owner = "client!kea",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9051 = new String[]{method4528(method4527("I8\u0001\u001aV\n")), method4528(method4527("L(\fX")), method4528(method4527("YsN\u001ai")), method4528(method4527("I8\u0001\u001aU\n")), method4528(method4527("I8\u0001\u001aW\n"))};
   @OriginalMember(
      owner = "client!kea",
      name = "r",
      descriptor = "I"
   )
   public static int field9048 = -1;
   @OriginalMember(
      owner = "client!kea",
      name = "s",
      descriptor = "I"
   )
   public int field9034;
   @OriginalMember(
      owner = "client!kea",
      name = "n",
      descriptor = "I"
   )
   public int field9035;
   @OriginalMember(
      owner = "client!kea",
      name = "A",
      descriptor = "I"
   )
   public int field9037;
   @OriginalMember(
      owner = "client!kea",
      name = "o",
      descriptor = "I"
   )
   public int field9039;
   @OriginalMember(
      owner = "client!kea",
      name = "v",
      descriptor = "I"
   )
   public int field9040;
   @OriginalMember(
      owner = "client!kea",
      name = "l",
      descriptor = "I"
   )
   public int field9041;
   @OriginalMember(
      owner = "client!kea",
      name = "p",
      descriptor = "I"
   )
   public static int field9042;
   @OriginalMember(
      owner = "client!kea",
      name = "u",
      descriptor = "I"
   )
   public int field9043;
   @OriginalMember(
      owner = "client!kea",
      name = "m",
      descriptor = "I"
   )
   public int field9044;
   @OriginalMember(
      owner = "client!kea",
      name = "t",
      descriptor = "I"
   )
   public static int field9045;
   @OriginalMember(
      owner = "client!kea",
      name = "z",
      descriptor = "I"
   )
   public int field9049;
   @OriginalMember(
      owner = "client!kea",
      name = "B",
      descriptor = "I"
   )
   public int field9050;
   @OriginalMember(
      owner = "client!kea",
      name = "q",
      descriptor = "Lcp;"
   )
   public class271 field9047;
   @OriginalMember(
      owner = "client!kea",
      name = "w",
      descriptor = "[I"
   )
   public static int[] field9046;

   @OriginalMember(
      owner = "client!kea",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4524(int arg0) {
      try {
         if (arg0 != -1) {
            method4526(117, true);
         }

         field9046 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field9051[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kea",
      name = "a",
      descriptor = "(Lcm;ILcm;)V"
   )
   public static final void method4525(class673 arg0, int arg1, class673 arg2) {
      try {
         if (arg2.field9975 != null) {
            arg2.method4924(arg1 + -2919);
         }

         ++field9042;
         if (arg1 != -51) {
            field9046 = null;
         }

         arg2.field9975 = arg0.field9975;
         arg2.field9972 = arg0;
         arg2.field9975.field9972 = arg2;
         arg2.field9972.field9975 = arg2;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field9051[0] + (arg0 != null ? field9051[2] : field9051[1]) + ',' + arg1 + ',' + (arg2 != null ? field9051[2] : field9051[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kea",
      name = "a",
      descriptor = "(IZ)V"
   )
   public static final void method4526(int arg0, boolean arg1) {
      boolean var2 = client.field1481;

      try {
         class161.method1344((byte)-104);
         ++field9045;
         if (arg0 != -2514) {
            field9048 = 117;
         }

         if (class391.method3090(arg0 + 2624, class157.field2022)) {
            class594[] var3 = class387.field5366;
            int var4 = 0;
            if (!var2 && var4 >= var3.length) {
               class161.method1344((byte)-104);
            } else {
               do {
                  class594 var5 = var3[var4];
                  ++var5.field8778;
                  if (~var5.field8778 > -51 && !arg1) {
                     return;
                  }

                  var5.field8778 = 0;
                  if (!var5.field8768 && var5.field8760 != null) {
                     ++class324.field4443;
                     class702 var6 = class19.method142(var5.field8765, class654.field9777, (byte)-113);
                     var5.method4423(var6, (byte)122);

                     try {
                        var5.method4419(126);
                     } catch (IOException var8) {
                        var5.field8768 = true;
                     }
                  }

                  ++var4;
               } while(var4 < var3.length);

               class161.method1344((byte)-104);
            }
         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field9051[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4527(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 20);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4528(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 34;
            break;
         case 1:
            var10005 = 93;
            break;
         case 2:
            var10005 = 96;
            break;
         case 3:
            var10005 = 52;
            break;
         default:
            var10005 = 20;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
