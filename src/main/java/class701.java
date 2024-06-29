import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public abstract class class701 {
   @OriginalMember(
      owner = "client!pc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10212 = new String[]{method5091(method5090("F5p<2")), method5091(method5090("F5p>2")), method5091(method5090("F5p?2"))};
   @OriginalMember(
      owner = "client!pc",
      name = "a",
      descriptor = "[Lrda;"
   )
   public static class693[] field10206 = new class693[50];
   @OriginalMember(
      owner = "client!pc",
      name = "c",
      descriptor = "[Lci;"
   )
   public static class477[] field10209 = new class477[14];
   @OriginalMember(
      owner = "client!pc",
      name = "g",
      descriptor = "Lbga;"
   )
   public static class378 field10208 = new class378(133, 9);
   @OriginalMember(
      owner = "client!pc",
      name = "e",
      descriptor = "I"
   )
   public static int field10210 = -1;
   @OriginalMember(
      owner = "client!pc",
      name = "d",
      descriptor = "Ljava/lang/String;"
   )
   public static String field10211 = null;
   @OriginalMember(
      owner = "client!pc",
      name = "f",
      descriptor = "I"
   )
   public static int field10205;
   @OriginalMember(
      owner = "client!pc",
      name = "b",
      descriptor = "I"
   )
   public static int field10207;

   @OriginalMember(
      owner = "client!pc",
      name = "b",
      descriptor = "(II)[[[B"
   )
   public static final byte[][][] method5087(int param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!pc",
      name = "b",
      descriptor = "(I)V"
   )
   public abstract void method3875(int arg0);

   @OriginalMember(
      owner = "client!pc",
      name = "a",
      descriptor = "(II)Z"
   )
   public abstract boolean method3876(int arg0, int arg1);

   @OriginalMember(
      owner = "client!pc",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method5088(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         if (arg1 != -1086528703) {
            field10211 = null;
         }

         if (~class478.field6604 >= ~arg4 && ~class313.field4171 <= ~arg4) {
            int var8 = class138.method1159(arg3, class663.field9442, (byte)-44, class265.field3451);
            int var7 = class138.method1159(arg0, class663.field9442, (byte)-44, class265.field3451);
            class104.method931(var8, true, arg4, arg2, var7);
         }

         ++field10205;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field10212[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pc",
      name = "a",
      descriptor = "(I)V"
   )
   public abstract void method3873(int arg0);

   @OriginalMember(
      owner = "client!pc",
      name = "a",
      descriptor = "(B)Ldja;"
   )
   public abstract class326 method3874(byte arg0);

   @OriginalMember(
      owner = "client!pc",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method5089(boolean arg0) {
      try {
         field10211 = null;
         if (arg0) {
            method5087(-32, 119);
         }

         field10206 = null;
         field10209 = null;
         field10208 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field10212[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5090(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 26);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5091(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 54;
            break;
         case 1:
            var10005 = 86;
            break;
         case 2:
            var10005 = 94;
            break;
         case 3:
            var10005 = 125;
            break;
         default:
            var10005 = 26;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
