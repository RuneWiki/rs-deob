import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class740 {
   @OriginalMember(
      owner = "client!lu",
      name = "f",
      descriptor = "I"
   )
   public int field10651;
   @OriginalMember(
      owner = "client!lu",
      name = "k",
      descriptor = "I"
   )
   public int field10659;
   @OriginalMember(
      owner = "client!lu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10664 = new String[]{method5339(method5338("\u0016\u0006x\r1")), method5339(method5338("\u0001]xfd")), method5339(method5338("\u0016\u0006x\u000e1")), method5339(method5338("\u0014\u0006:$")), method5339(method5338("\u0016\u0006x\f1")), method5339(method5338("\u0016\u0006x\n1")), method5339(method5338("\u0016\u0006xtp\u0014\u001a\"v1")), method5339(method5338("\u0016\u0006x\u000b1"))};
   @OriginalMember(
      owner = "client!lu",
      name = "g",
      descriptor = "Lgh;"
   )
   public static class572 field10661 = new class572(114, 3);
   @OriginalMember(
      owner = "client!lu",
      name = "e",
      descriptor = "I"
   )
   public int field10652;
   @OriginalMember(
      owner = "client!lu",
      name = "m",
      descriptor = "I"
   )
   public static int field10653;
   @OriginalMember(
      owner = "client!lu",
      name = "i",
      descriptor = "I"
   )
   public int field10654;
   @OriginalMember(
      owner = "client!lu",
      name = "a",
      descriptor = "I"
   )
   public static int field10655;
   @OriginalMember(
      owner = "client!lu",
      name = "d",
      descriptor = "I"
   )
   public static int field10658;
   @OriginalMember(
      owner = "client!lu",
      name = "c",
      descriptor = "I"
   )
   public static int field10660;
   @OriginalMember(
      owner = "client!lu",
      name = "j",
      descriptor = "I"
   )
   public int field10662;
   @OriginalMember(
      owner = "client!lu",
      name = "h",
      descriptor = "Ldfa;"
   )
   public class173 field10657;
   @OriginalMember(
      owner = "client!lu",
      name = "b",
      descriptor = "Llu;"
   )
   public class740 field10656;
   @OriginalMember(
      owner = "client!lu",
      name = "l",
      descriptor = "Lwga;"
   )
   public static class778 field10663;

   @OriginalMember(
      owner = "client!lu",
      name = "a",
      descriptor = "(Lhv;B)V"
   )
   public static final void method5332(class542 arg0, byte arg1) {
      try {
         ++field10660;
         class59.field1130.method2585(arg0, 106);
         arg0.field7861 = arg0.field7859.field6907;
         class782.field11454 += arg0.field7861;
         arg0.field7859.field6907 = 0;
         if (arg1 != 77) {
            method5333(115, true, -28);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10664[2] + (arg0 != null ? field10664[1] : field10664[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lu",
      name = "a",
      descriptor = "(IZI)I"
   )
   public static final int method5333(int arg0, boolean arg1, int arg2) {
      try {
         ++field10653;
         if (arg1) {
            method5337(-19, -87, 39, (Class)null);
         }

         int var3 = arg0 * 57 + arg2;
         int var4 = var3 << 13 ^ var3;
         int var5 = (var4 * 15731 * var4 - -789221) * var4 - -1376312589 & Integer.MAX_VALUE;
         return var5 >> 19 & 255;
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field10664[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lu",
      name = "b",
      descriptor = "(B)Led;"
   )
   public final class732 method5334(byte arg0) {
      try {
         if (arg0 != -126) {
            method5336((byte)-100);
         }

         ++field10655;
         return class640.method4689(this.field10659, 109);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10664[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lu",
      name = "a",
      descriptor = "(ZI)Llu;"
   )
   public final class740 method5335(boolean arg0, int arg1) {
      try {
         ++field10658;
         if (arg0) {
            this.field10652 = 29;
         }

         return new class740(this.field10659, arg1);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field10664[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lu",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5336(byte arg0) {
      try {
         field10663 = null;
         if (arg0 < 63) {
            field10663 = null;
         }

         field10661 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10664[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lu",
      name = "a",
      descriptor = "(IIILjava/lang/Class;)Lmc;"
   )
   public static final class144 method5337(int arg0, int arg1, int arg2, Class arg3) {
      class600 var4 = class90.field1473[arg0][arg1][arg2];
      if (var4 == null) {
         return null;
      } else {
         for(class533 var5 = var4.field8653; var5 != null; var5 = var5.field7763) {
            class144 var6 = var5.field7766;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field2354 == arg1 && var6.field2347 == arg2) {
               return var6;
            }
         }

         return null;
      }
   }

   @OriginalMember(
      owner = "client!lu",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class740(int arg0, int arg1) {
      try {
         this.field10651 = arg1;
         this.field10659 = arg0;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field10664[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5338(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 25);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5339(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 122;
            break;
         case 1:
            var10005 = 115;
            break;
         case 2:
            var10005 = 86;
            break;
         case 3:
            var10005 = 72;
            break;
         default:
            var10005 = 25;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
