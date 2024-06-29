import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public class class602 {
   @OriginalMember(
      owner = "client!kaa",
      name = "b",
      descriptor = "Lsn;"
   )
   private class675 field8807;
   @OriginalMember(
      owner = "client!kaa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8809 = new String[]{method4456(method4455("J{'#\u001a\t")), method4456(method4455("Oo*a")), method4456(method4455("Z4h#&")), method4456(method4455("J{'#\u001f\t")), method4456(method4455("J{'#\u0019\t")), method4456(method4455("J{'#\u0018\t")), method4456(method4455("J{'#gHt/ye\t"))};
   @OriginalMember(
      owner = "client!kaa",
      name = "f",
      descriptor = "I"
   )
   public static int field8804;
   @OriginalMember(
      owner = "client!kaa",
      name = "e",
      descriptor = "I"
   )
   public static int field8805;
   @OriginalMember(
      owner = "client!kaa",
      name = "a",
      descriptor = "I"
   )
   public static int field8806;
   @OriginalMember(
      owner = "client!kaa",
      name = "d",
      descriptor = "I"
   )
   public static int field8808;
   @OriginalMember(
      owner = "client!kaa",
      name = "c",
      descriptor = "Lhe;"
   )
   private class294 field8803;

   @OriginalMember(
      owner = "client!kaa",
      name = "a",
      descriptor = "(Z)Lhe;"
   )
   public final class294 method4451(boolean arg0) {
      try {
         if (!arg0) {
            this.field8803 = null;
         }

         ++field8808;
         class294 var2 = this.field8803;
         if (this.field8807.field10053 == var2) {
            this.field8803 = null;
            return null;
         } else {
            this.field8803 = var2.field4656;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8809[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kaa",
      name = "a",
      descriptor = "(BLsn;)V"
   )
   public final void method4452(byte arg0, class675 arg1) {
      try {
         if (arg0 > 33) {
            ++field8806;
            this.field8807 = arg1;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8809[0] + arg0 + ',' + (arg1 != null ? field8809[2] : field8809[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kaa",
      name = "a",
      descriptor = "(B)Lhe;"
   )
   public final class294 method4453(byte arg0) {
      try {
         if (arg0 != 127) {
            return null;
         } else {
            ++field8804;
            class294 var2 = this.field8807.field10053.field4656;
            if (this.field8807.field10053 == var2) {
               this.field8803 = null;
               return null;
            } else {
               this.field8803 = var2.field4656;
               return var2;
            }
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8809[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kaa",
      name = "a",
      descriptor = "(IIIIB)V"
   )
   public static final void method4454(int arg0, int arg1, int arg2, int arg3, byte arg4) {
      try {
         ++field8805;
         if (arg4 == -67) {
            if (~arg0 < ~arg1) {
               class689.method5076(arg0, arg1, (byte)57, class512.field7820[arg2], arg3);
            } else {
               class689.method5076(arg1, arg0, (byte)57, class512.field7820[arg2], arg3);
            }
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field8809[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kaa",
      name = "<init>",
      descriptor = "()V"
   )
   public class602() {
   }

   @OriginalMember(
      owner = "client!kaa",
      name = "<init>",
      descriptor = "(Lsn;)V"
   )
   public class602(class675 arg0) {
      try {
         this.field8807 = arg0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8809[6] + (arg0 != null ? field8809[2] : field8809[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kaa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4455(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 91);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kaa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4456(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 33;
            break;
         case 1:
            var10005 = 26;
            break;
         case 2:
            var10005 = 70;
            break;
         case 3:
            var10005 = 13;
            break;
         default:
            var10005 = 91;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
