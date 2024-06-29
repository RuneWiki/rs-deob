import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public abstract class class226 extends class731 {
   @OriginalMember(
      owner = "client!ta",
      name = "A",
      descriptor = "S"
   )
   public short field3209;
   @OriginalMember(
      owner = "client!ta",
      name = "F",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3210 = new String[]{method1767(method1766("\n}\u0015z>V")), method1767(method1766("\n}\u0015\u000f\u0016\u0010uO\rW")), method1767(method1766("\u0010iW_")), method1767(method1766("\u00052\u0015\u001d\u0002")), method1767(method1766("\n}\u0015tW")), method1767(method1766("\n}\u0015pW")), method1767(method1766("\n}\u0015vW"))};
   @OriginalMember(
      owner = "client!ta",
      name = "D",
      descriptor = "Lwu;"
   )
   public static class395 field3208 = new class395(10, 2, 2, 0);
   @OriginalMember(
      owner = "client!ta",
      name = "C",
      descriptor = "I"
   )
   public static int field3205;
   @OriginalMember(
      owner = "client!ta",
      name = "B",
      descriptor = "I"
   )
   public static int field3206;
   @OriginalMember(
      owner = "client!ta",
      name = "E",
      descriptor = "I"
   )
   public static int field3207;

   @OriginalMember(
      owner = "client!ta",
      name = "a",
      descriptor = "(ZLha;)Z",
      line = 3
   )
   public final boolean method1762(boolean arg0, class66 arg1) {
      try {
         ++field3206;
         if (arg0) {
            this.method1764((byte)117);
         }

         return class50.method405(super.field10694 >> class773.field11359, -56, super.field10693 >> class773.field11359, super.field10702);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field3210[6] + arg0 + ',' + (arg1 != null ? field3210[3] : field3210[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ta",
      name = "a",
      descriptor = "([Lmn;Z)I",
      line = 15
   )
   public final int method1763(class389[] arg0, boolean arg1) {
      try {
         ++field3207;
         return !arg1 ? -63 : this.method5323(super.field10694 >> class773.field11359, 94, super.field10693 >> class773.field11359, arg0);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field3210[4] + (arg0 != null ? field3210[3] : field3210[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ta",
      name = "i",
      descriptor = "(B)Z",
      line = 28
   )
   public final boolean method1764(byte arg0) {
      try {
         if (arg0 != -78) {
            return true;
         } else {
            ++field3205;
            return class506.field7334[(super.field10694 >> class773.field11359) + -class712.field10385 + class106.field1335][(super.field10693 >> class773.field11359) + -class377.field5453 - -class106.field1335];
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3210[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ta",
      name = "j",
      descriptor = "(B)V",
      line = 40
   )
   public static void method1765(byte arg0) {
      try {
         field3208 = null;
         int var1 = 124 / ((arg0 - -47) / 39);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3210[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ta",
      name = "<init>",
      descriptor = "(IIIIII)V",
      line = 55
   )
   public class226(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         super.field10694 = arg0;
         super.field10701 = (byte)arg3;
         this.field3209 = (short)arg5;
         super.field10693 = arg2;
         super.field10697 = arg1;
         super.field10702 = (byte)arg4;
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field3210[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ta",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1766(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 127);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ta",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1767(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 126;
            break;
         case 1:
            var10005 = 28;
            break;
         case 2:
            var10005 = 59;
            break;
         case 3:
            var10005 = 51;
            break;
         default:
            var10005 = 127;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
