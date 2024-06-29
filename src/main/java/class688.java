import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kja")
public class class688 {
   @OriginalMember(
      owner = "client!kja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10082 = new String[]{method5024(method5023("F[\\g|\u0005")), method5024(method5023("V\u001f\u0013gE")), method5024(method5023("F[\\g{\u0005")), method5024(method5023("CDQ%")), method5024(method5023("\rvp\u001d")), method5024(method5023("\u0001\u0011")), method5024(method5023("F[\\gy\u0005")), method5024(method5023("F[\\gz\u0005"))};
   @OriginalMember(
      owner = "client!kja",
      name = "d",
      descriptor = "Lnw;"
   )
   public static class616 field10078 = new class616(49, -1);
   @OriginalMember(
      owner = "client!kja",
      name = "c",
      descriptor = "I"
   )
   public static int field10081 = 1401;
   @OriginalMember(
      owner = "client!kja",
      name = "b",
      descriptor = "[Lci;"
   )
   public static class477[] field10080 = new class477[14];
   @OriginalMember(
      owner = "client!kja",
      name = "a",
      descriptor = "I"
   )
   public static int field10076;
   @OriginalMember(
      owner = "client!kja",
      name = "f",
      descriptor = "I"
   )
   public static int field10077;
   @OriginalMember(
      owner = "client!kja",
      name = "e",
      descriptor = "I"
   )
   public static int field10079;

   @OriginalMember(
      owner = "client!kja",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5019(int arg0) {
      try {
         if (arg0 != 2878) {
            field10081 = -13;
         }

         field10080 = null;
         field10078 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field10082[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kja",
      name = "a",
      descriptor = "(JI)Ljava/lang/String;"
   )
   public static final String method5020(long arg0, int arg1) {
      try {
         class483.field6656.setTime(new Date(arg0));
         ++field10076;
         int var3 = class483.field6656.get(7);
         int var4 = class483.field6656.get(5);
         if (arg1 > -76) {
            field10081 = 17;
         }

         int var5 = class483.field6656.get(2);
         int var6 = class483.field6656.get(1);
         int var7 = class483.field6656.get(11);
         int var8 = class483.field6656.get(12);
         int var9 = class483.field6656.get(13);
         return class323.field4301[var3 - 1] + field10082[5] + var4 / 10 + var4 % 10 + "-" + class620.field8669[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + field10082[4];
      } catch (RuntimeException var11) {
         throw class534.method3846(var11, field10082[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kja",
      name = "a",
      descriptor = "(II)I"
   )
   public static final int method5021(int arg0, int arg1) {
      try {
         if (arg0 != -18757) {
            return -58;
         } else {
            ++field10079;
            return arg1 >>> 8;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10082[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kja",
      name = "a",
      descriptor = "(Ljava/lang/String;IZ)V"
   )
   public static final void method5022(String param0, int param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!kja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5023(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 56);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5024(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 45;
            break;
         case 1:
            var10005 = 49;
            break;
         case 2:
            var10005 = 61;
            break;
         case 3:
            var10005 = 73;
            break;
         default:
            var10005 = 56;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
