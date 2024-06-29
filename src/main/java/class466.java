import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sja")
public class class466 {
   @OriginalMember(
      owner = "client!sja",
      name = "d",
      descriptor = "Liw;"
   )
   private class107 field6763 = new class107(64);
   @OriginalMember(
      owner = "client!sja",
      name = "g",
      descriptor = "Lsa;"
   )
   private class39 field6761;
   @OriginalMember(
      owner = "client!sja",
      name = "e",
      descriptor = "I"
   )
   public int field6764;
   @OriginalMember(
      owner = "client!sja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6770 = new String[]{method3586(method3585("yM&m?\"")), method3586(method3585("dR+/")), method3586(method3585("q\tim\u0001")), method3586(method3585("yM&m@cI.7B\"")), method3586(method3585("yM&m8\"")), method3586(method3585("yM&m>\"")), method3586(method3585("yM&m=\""))};
   @OriginalMember(
      owner = "client!sja",
      name = "c",
      descriptor = "[B"
   )
   public static byte[] field6768 = new byte[2048];
   @OriginalMember(
      owner = "client!sja",
      name = "f",
      descriptor = "Lhha;"
   )
   public static class724 field6760 = new class724(110, -1);
   @OriginalMember(
      owner = "client!sja",
      name = "b",
      descriptor = "I"
   )
   public static int field6762;
   @OriginalMember(
      owner = "client!sja",
      name = "a",
      descriptor = "I"
   )
   public static int field6765;
   @OriginalMember(
      owner = "client!sja",
      name = "h",
      descriptor = "I"
   )
   public static int field6766;
   @OriginalMember(
      owner = "client!sja",
      name = "j",
      descriptor = "I"
   )
   public static int field6767;
   @OriginalMember(
      owner = "client!sja",
      name = "i",
      descriptor = "I"
   )
   public static int field6769;

   @OriginalMember(
      owner = "client!sja",
      name = "a",
      descriptor = "(BI)Lcda;"
   )
   public static final class701 method3581(byte arg0, int arg1) {
      try {
         ++field6767;
         if (arg0 >= -51) {
            return null;
         } else {
            return ~arg1 <= -1 && ~arg1 > -101 ? class560.field7966[arg1] : null;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6770[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sja",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3582(byte arg0) {
      try {
         if (arg0 != -76) {
            method3582((byte)-43);
         }

         field6768 = null;
         field6760 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field6770[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sja",
      name = "a",
      descriptor = "(I)I"
   )
   public static final int method3583(int arg0) {
      try {
         int var1 = 52 % ((-15 - arg0) / 49);
         ++field6769;
         return 16;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6770[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sja",
      name = "a",
      descriptor = "(II)Luu;"
   )
   public final class240 method3584(int arg0, int arg1) {
      try {
         if (arg0 < 81) {
            return null;
         } else {
            ++field6766;
            class107 var3 = this.field6763;
            class240 var4;
            synchronized(this.field6763) {
               var4 = (class240)this.field6763.method1041((long)arg1, 8);
            }

            if (var4 != null) {
               return var4;
            } else {
               class39 var5 = this.field6761;
               byte[] var6;
               synchronized(this.field6761) {
                  var6 = this.field6761.method460((byte)-11, arg1, 19);
               }

               class240 var7 = new class240();
               if (var6 != null) {
                  var7.method2106(new class65(var6), (byte)-56);
               }

               class107 var8 = this.field6763;
               synchronized(this.field6763) {
                  this.field6763.method1050(-79, var7, (long)arg1);
                  return var7;
               }
            }
         }
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field6770[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sja",
      name = "<init>",
      descriptor = "(Ltb;ILsa;)V"
   )
   public class466(class392 arg0, int arg1, class39 arg2) {
      try {
         this.field6761 = arg2;
         this.field6764 = this.field6761.method434((byte)-106, 19);
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field6770[3] + (arg0 != null ? field6770[2] : field6770[1]) + ',' + arg1 + ',' + (arg2 != null ? field6770[2] : field6770[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3585(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 124);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3586(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 10;
            break;
         case 1:
            var10005 = 39;
            break;
         case 2:
            var10005 = 71;
            break;
         case 3:
            var10005 = 67;
            break;
         default:
            var10005 = 124;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
