import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oja")
public abstract class class125 {
   @OriginalMember(
      owner = "client!oja",
      name = "a",
      descriptor = "Liu;"
   )
   public class530 field1630;
   @OriginalMember(
      owner = "client!oja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1631 = new String[]{method1086(method1085("{-y$")), method1086(method1085("z2tf\u001a|6|<\u0018=")), method1086(method1085("nv;f[")), method1086(method1085("z2tfh=")), method1086(method1085("z2tfi="))};
   @OriginalMember(
      owner = "client!oja",
      name = "d",
      descriptor = "I"
   )
   public static int field1629 = 0;
   @OriginalMember(
      owner = "client!oja",
      name = "e",
      descriptor = "Laka;"
   )
   public static class418 field1627 = new class418(5, 0);
   @OriginalMember(
      owner = "client!oja",
      name = "b",
      descriptor = "F"
   )
   public static float field1626;
   @OriginalMember(
      owner = "client!oja",
      name = "c",
      descriptor = "I"
   )
   public static int field1628;

   @OriginalMember(
      owner = "client!oja",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method1082(boolean arg0) {
      try {
         field1627 = null;
         if (!arg0) {
            field1629 = -75;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1631[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oja",
      name = "a",
      descriptor = "(Lll;II)V"
   )
   public abstract void method345(class549 arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!oja",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method1083(int arg0) {
      if (arg0 == 0) {
         if (class500.field6974 == 2) {
            class403.field5537[0].method4812(class700.field10259[0]);
            class403.field5537[1].method4812(class700.field10259[1]);
         } else if (class500.field6974 == 3) {
            class403.field5537[0].method4812(class700.field10259[0]);
            class403.field5537[1].method4812(class700.field10259[1]);
            class403.field5537[2].method4812(class700.field10259[2]);
         } else {
            class403.field5537[0].method4812(class700.field10259[0]);
            class403.field5537[1].method4812(class700.field10259[1]);
            class403.field5537[2].method4812(class700.field10259[2]);
            class403.field5537[3].method4812(class700.field10259[3]);
         }
      } else if (arg0 == 1) {
         if (class500.field6974 == 2) {
            class403.field5537[0].method4812(class700.field10259[2]);
         } else if (class500.field6974 == 3) {
            class403.field5537[0].method4812(class700.field10259[3]);
            class403.field5537[1].method4812(class700.field10259[4]);
         } else {
            class403.field5537[0].method4812(class700.field10259[4]);
            class403.field5537[1].method4812(class700.field10259[5]);
            class403.field5537[2].method4812(class700.field10259[6]);
         }
      } else {
         if (arg0 == 2) {
            if (class500.field6974 == 2) {
               class403.field5537[0].method4812(class700.field10259[3]);
               return;
            }

            if (class500.field6974 == 3) {
               class403.field5537[0].method4812(class700.field10259[5]);
               return;
            }

            class403.field5537[0].method4812(class700.field10259[7]);
         }

      }
   }

   @OriginalMember(
      owner = "client!oja",
      name = "a",
      descriptor = "(III)V"
   )
   public abstract void method341(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!oja",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public abstract void method346(boolean arg0, boolean arg1);

   @OriginalMember(
      owner = "client!oja",
      name = "a",
      descriptor = "(Lid;I)I"
   )
   public static final int method1084(class438 arg0, int arg1) {
      try {
         ++field1628;
         if (arg1 != 30623) {
            return 61;
         } else {
            String var2 = class568.method4268(-115, arg0);
            return class492.field6871.method146(class476.field6643, var2, (byte)100);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field1631[4] + (arg0 != null ? field1631[2] : field1631[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oja",
      name = "a",
      descriptor = "(ZI)V"
   )
   public abstract void method343(boolean arg0, int arg1);

   @OriginalMember(
      owner = "client!oja",
      name = "b",
      descriptor = "(Z)Z"
   )
   public abstract boolean method347(boolean arg0);

   @OriginalMember(
      owner = "client!oja",
      name = "a",
      descriptor = "(I)V"
   )
   public abstract void method340(int arg0);

   @OriginalMember(
      owner = "client!oja",
      name = "<init>",
      descriptor = "(Liu;)V"
   )
   public class125(class530 arg0) {
      try {
         this.field1630 = arg0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1631[1] + (arg0 != null ? field1631[2] : field1631[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!oja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1085(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 38);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1086(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 21;
            break;
         case 1:
            var10005 = 88;
            break;
         case 2:
            var10005 = 21;
            break;
         case 3:
            var10005 = 72;
            break;
         default:
            var10005 = 38;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
