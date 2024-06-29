import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class680 {
   @OriginalMember(
      owner = "client!pb",
      name = "f",
      descriptor = "S"
   )
   public short field9972;
   @OriginalMember(
      owner = "client!pb",
      name = "k",
      descriptor = "S"
   )
   public short field9979;
   @OriginalMember(
      owner = "client!pb",
      name = "g",
      descriptor = "Z"
   )
   public boolean field9978;
   @OriginalMember(
      owner = "client!pb",
      name = "n",
      descriptor = "B"
   )
   public byte field9965;
   @OriginalMember(
      owner = "client!pb",
      name = "p",
      descriptor = "I"
   )
   public int field9977;
   @OriginalMember(
      owner = "client!pb",
      name = "q",
      descriptor = "I"
   )
   public int field9968;
   @OriginalMember(
      owner = "client!pb",
      name = "j",
      descriptor = "S"
   )
   public short field9969;
   @OriginalMember(
      owner = "client!pb",
      name = "o",
      descriptor = "I"
   )
   public int field9975;
   @OriginalMember(
      owner = "client!pb",
      name = "m",
      descriptor = "I"
   )
   public int field9970;
   @OriginalMember(
      owner = "client!pb",
      name = "d",
      descriptor = "I"
   )
   public int field9967;
   @OriginalMember(
      owner = "client!pb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9982 = new String[]{method4964(method4963("ua\u007fY1")), method4964(method4963("ua\u007f$pkj%&1")), method4964(method4963("ua\u007f[1")), method4964(method4963("~-\u007f6d")), method4964(method4963("kv=t")), method4964(method4963("ua\u007fZ1"))};
   @OriginalMember(
      owner = "client!pb",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field9966 = new int[4096];
   @OriginalMember(
      owner = "client!pb",
      name = "e",
      descriptor = "I"
   )
   public static int field9971 = 0;
   @OriginalMember(
      owner = "client!pb",
      name = "a",
      descriptor = "Luw;"
   )
   public static class435 field9974 = new class435(48, -1);
   @OriginalMember(
      owner = "client!pb",
      name = "l",
      descriptor = "[S"
   )
   public static short[] field9981 = new short[256];
   @OriginalMember(
      owner = "client!pb",
      name = "i",
      descriptor = "I"
   )
   public static int field9973;
   @OriginalMember(
      owner = "client!pb",
      name = "h",
      descriptor = "I"
   )
   public static int field9976;
   @OriginalMember(
      owner = "client!pb",
      name = "c",
      descriptor = "I"
   )
   public static int field9980;

   @OriginalMember(
      owner = "client!pb",
      name = "a",
      descriptor = "(BLuba;)V"
   )
   public static final void method4960(byte arg0, class451 arg1) {
      boolean var2 = client.field4564;

      try {
         ++field9973;
         class618 var3 = (class618)class231.field3383.method2579(-801);
         if (var2) {
            if (var3.field8986 == arg1) {
               if (var3.field8978 != null) {
                  class749.field10795.method1606(var3.field8978);
                  var3.field8978 = null;
               }

               var3.method154(71);
               return;
            }

            var3 = (class618)class231.field3383.method2583(1);
         }

         while(true) {
            while(var3 != null) {
               if (var3.field8986 == arg1) {
                  if (var3.field8978 != null) {
                     class749.field10795.method1606(var3.field8978);
                     var3.field8978 = null;
                  }

                  var3.method154(71);
                  return;
               }

               var3 = (class618)class231.field3383.method2583(1);
            }

            if (!var2) {
               if (arg0 >= -3) {
                  field9981 = null;
                  return;
               }

               return;
            }

            var3 = (class618)class231.field3383.method2583(1);
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field9982[5] + arg0 + ',' + (arg1 != null ? field9982[3] : field9982[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pb",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4961(int arg0) {
      try {
         field9974 = null;
         if (arg0 != 48) {
            method4961(-63);
         }

         field9981 = null;
         field9966 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field9982[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pb",
      name = "a",
      descriptor = "(IIB)Z"
   )
   public static final boolean method4962(int arg0, int arg1, byte arg2) {
      try {
         ++field9976;
         if (arg2 != 93) {
            method4962(-61, 115, (byte)74);
         }

         return ~(32 & arg0) != -1;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field9982[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pb",
      name = "<init>",
      descriptor = "(IIIIIIIIIZZI)V"
   )
   public class680(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
      try {
         this.field9972 = (short)arg6;
         this.field9979 = (short)arg5;
         this.field9978 = arg10;
         this.field9965 = (byte)arg8;
         this.field9977 = arg1;
         this.field9968 = arg0;
         this.field9969 = (short)arg4;
         this.field9975 = arg2;
         this.field9970 = arg11;
         this.field9967 = arg3;
      } catch (RuntimeException var14) {
         throw class608.method4462(var14, field9982[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4963(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 25);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4964(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 5;
            break;
         case 1:
            var10005 = 3;
            break;
         case 2:
            var10005 = 81;
            break;
         case 3:
            var10005 = 24;
            break;
         default:
            var10005 = 25;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
