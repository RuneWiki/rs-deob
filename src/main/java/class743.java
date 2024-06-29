import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lja")
public class class743 {
   @OriginalMember(
      owner = "client!lja",
      name = "m",
      descriptor = "[I"
   )
   public int[] field10702;
   @OriginalMember(
      owner = "client!lja",
      name = "h",
      descriptor = "B"
   )
   public byte field10701;
   @OriginalMember(
      owner = "client!lja",
      name = "b",
      descriptor = "[I"
   )
   public int[] field10704;
   @OriginalMember(
      owner = "client!lja",
      name = "e",
      descriptor = "B"
   )
   public byte field10710;
   @OriginalMember(
      owner = "client!lja",
      name = "k",
      descriptor = "[I"
   )
   public int[] field10705;
   @OriginalMember(
      owner = "client!lja",
      name = "d",
      descriptor = "S"
   )
   public short field10698;
   @OriginalMember(
      owner = "client!lja",
      name = "l",
      descriptor = "S"
   )
   public short field10699;
   @OriginalMember(
      owner = "client!lja",
      name = "f",
      descriptor = "S"
   )
   public short field10706;
   @OriginalMember(
      owner = "client!lja",
      name = "c",
      descriptor = "S"
   )
   public short field10703;
   @OriginalMember(
      owner = "client!lja",
      name = "a",
      descriptor = "[S"
   )
   public short[] field10697;
   @OriginalMember(
      owner = "client!lja",
      name = "j",
      descriptor = "[S"
   )
   public short[] field10707;
   @OriginalMember(
      owner = "client!lja",
      name = "i",
      descriptor = "[S"
   )
   public short[] field10709;
   @OriginalMember(
      owner = "client!lja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10712 = new String[]{method5395(method5394("6\u0011\u000fScr")), method5395(method5394("6\u0011\u000fS`r")), method5395(method5394("6\u0011\u000fS\u001e3\u0015\u0007\t\u001cr"))};
   @OriginalMember(
      owner = "client!lja",
      name = "g",
      descriptor = "I"
   )
   public static int field10700;
   @OriginalMember(
      owner = "client!lja",
      name = "o",
      descriptor = "I"
   )
   public static int field10708;
   @OriginalMember(
      owner = "client!lja",
      name = "n",
      descriptor = "I"
   )
   public static int field10711;

   static {
      new class248("", 76);
   }

   @OriginalMember(
      owner = "client!lja",
      name = "a",
      descriptor = "(IIIII)V",
      line = 13
   )
   public static final void method5392(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field10711;
         if (arg4 != -1413) {
            field10700 = -20;
         }

         if (-arg3 + arg2 >= class515.field7502 && arg2 - -arg3 <= class130.field2163 && -arg3 + arg0 >= class3.field16 && class581.field8354 >= arg0 - -arg3) {
            class519.method3921(arg3, true, arg1, arg2, arg0);
         } else {
            class168.method1520(arg0, arg3, arg1, (byte)-123, arg2);
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field10712[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lja",
      name = "a",
      descriptor = "(I)V",
      line = 38
   )
   public static final void method5393(int arg0) {
      try {
         if (class600.field8650 != null) {
            class600.field8650.method1557(-120);
         }

         ++field10708;
         if (class39.field934 != null) {
            class39.field934.method1557(arg0 + -80);
         }

         if (arg0 != 4) {
            method5392(-112, -73, 74, 69, -74);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10712[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lja",
      name = "<init>",
      descriptor = "(IIIIIIIIIIIIII)V",
      line = 56
   )
   public class743(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
      try {
         this.field10702 = new int[4];
         this.field10701 = (byte)arg1;
         this.field10704 = new int[4];
         this.field10710 = (byte)arg0;
         this.field10705 = new int[4];
         this.field10702[3] = arg5;
         this.field10702[0] = arg2;
         this.field10702[2] = arg4;
         this.field10702[1] = arg3;
         this.field10705[3] = arg9;
         this.field10705[0] = arg6;
         this.field10705[1] = arg7;
         this.field10705[2] = arg8;
         this.field10704[3] = arg13;
         this.field10704[2] = arg12;
         this.field10704[0] = arg10;
         this.field10698 = (short)(arg2 >> class76.field1336);
         this.field10704[1] = arg11;
         this.field10699 = (short)(arg4 >> class76.field1336);
         this.field10706 = (short)(arg10 >> class76.field1336);
         this.field10703 = (short)(arg12 >> class76.field1336);
         this.field10697 = new short[4];
         this.field10707 = new short[4];
         this.field10709 = new short[4];
      } catch (RuntimeException var16) {
         throw class608.method4462(var16, field10712[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5394(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 34);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5395(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 90;
            break;
         case 1:
            var10005 = 123;
            break;
         case 2:
            var10005 = 110;
            break;
         case 3:
            var10005 = 125;
            break;
         default:
            var10005 = 34;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
