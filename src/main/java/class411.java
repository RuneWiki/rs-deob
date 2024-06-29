import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class411 extends class449 {
   @OriginalMember(
      owner = "client!br",
      name = "v",
      descriptor = "I"
   )
   public int field6021;
   @OriginalMember(
      owner = "client!br",
      name = "A",
      descriptor = "I"
   )
   public int field6020;
   @OriginalMember(
      owner = "client!br",
      name = "x",
      descriptor = "I"
   )
   public int field6018;
   @OriginalMember(
      owner = "client!br",
      name = "r",
      descriptor = "I"
   )
   public int field6027;
   @OriginalMember(
      owner = "client!br",
      name = "z",
      descriptor = "I"
   )
   public int field6024;
   @OriginalMember(
      owner = "client!br",
      name = "y",
      descriptor = "I"
   )
   public int field6019;
   @OriginalMember(
      owner = "client!br",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6028 = new String[]{method3146(method3145("<.\u0010\nK")), method3146(method3145("<.\u0010\u0000K")), method3146(method3145("0)R'")), method3146(method3145("<.\u0010w\n05JuK")), method3146(method3145("%r\u0010e\u001e")), method3146(method3145("<.\u0010\u0007K")), method3146(method3145("<.\u0010\u0006K"))};
   @OriginalMember(
      owner = "client!br",
      name = "s",
      descriptor = "I"
   )
   public static int field6022;
   @OriginalMember(
      owner = "client!br",
      name = "t",
      descriptor = "I"
   )
   public static int field6025;
   @OriginalMember(
      owner = "client!br",
      name = "u",
      descriptor = "I"
   )
   public static int field6026;
   @OriginalMember(
      owner = "client!br",
      name = "w",
      descriptor = "Lvia;"
   )
   public static class587 field6023;

   @OriginalMember(
      owner = "client!br",
      name = "<init>",
      descriptor = "(Lfk;Lqda;IIIIIIIIIIIII)V"
   )
   public class411(class678 arg0, class112 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
      super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);

      try {
         this.field6021 = arg13;
         this.field6020 = arg10;
         this.field6018 = arg12;
         this.field6027 = arg9;
         this.field6024 = arg14;
         this.field6019 = arg11;
      } catch (RuntimeException var17) {
         throw class608.method4462(var17, field6028[3] + (arg0 != null ? field6028[4] : field6028[2]) + ',' + (arg1 != null ? field6028[4] : field6028[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ',' + arg14 + ')');
      }
   }

   @OriginalMember(
      owner = "client!br",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method3142(int arg0) {
      try {
         if (arg0 <= -55) {
            class115.field1862.method1589((byte)119);
            ++field6026;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6028[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!br",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method3143(int arg0, int arg1) {
      try {
         class554.field8037 = arg1;
         ++field6025;
         class179 var2 = class641.field9350;
         synchronized(class641.field9350) {
            class641.field9350.method1589((byte)92);
         }

         if (arg0 != -24596) {
            field6023 = null;
         }

         class179 var3 = class734.field10556;
         synchronized(class734.field10556) {
            class734.field10556.method1589((byte)69);
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field6028[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!br",
      name = "a",
      descriptor = "(B)Lqg;"
   )
   public class485 method672(byte arg0) {
      try {
         ++field6022;
         return arg0 != 83 ? null : class471.field6841;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field6028[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!br",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method3144(boolean arg0) {
      try {
         field6023 = null;
         if (!arg0) {
            field6023 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6028[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!br",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3145(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 99);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!br",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3146(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 94;
            break;
         case 1:
            var10005 = 92;
            break;
         case 2:
            var10005 = 62;
            break;
         case 3:
            var10005 = 75;
            break;
         default:
            var10005 = 99;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
