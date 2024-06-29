import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class474 {
   @OriginalMember(
      owner = "client!uf",
      name = "f",
      descriptor = "Loi;"
   )
   private class80 field6819 = new class80(256);
   @OriginalMember(
      owner = "client!uf",
      name = "j",
      descriptor = "Lkf;"
   )
   private class266 field6825;
   @OriginalMember(
      owner = "client!uf",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6830 = new String[]{method3456(method3455("ZJ7\"-")), method3456(method3455("AYu\n")), method3456(method3455("T\u00027Hx")), method3456(method3455("ZJ7!-")), method3456(method3455("ZJ7 -")), method3456(method3455("ZJ7'-")), method3456(method3455("ZJ7#-")), method3456(method3455("ZJ7%-")), method3456(method3455("ZJ7$-")), method3456(method3455("ZJ7ZlAEmX-"))};
   @OriginalMember(
      owner = "client!uf",
      name = "k",
      descriptor = "Lep;"
   )
   public static class446 field6828 = new class446(0);
   @OriginalMember(
      owner = "client!uf",
      name = "h",
      descriptor = "I"
   )
   public static int field6829 = 0;
   @OriginalMember(
      owner = "client!uf",
      name = "l",
      descriptor = "I"
   )
   public static int field6818;
   @OriginalMember(
      owner = "client!uf",
      name = "c",
      descriptor = "I"
   )
   public static int field6820;
   @OriginalMember(
      owner = "client!uf",
      name = "a",
      descriptor = "I"
   )
   public static int field6821;
   @OriginalMember(
      owner = "client!uf",
      name = "b",
      descriptor = "I"
   )
   public static int field6822;
   @OriginalMember(
      owner = "client!uf",
      name = "g",
      descriptor = "I"
   )
   public static int field6823;
   @OriginalMember(
      owner = "client!uf",
      name = "d",
      descriptor = "I"
   )
   public static int field6826;
   @OriginalMember(
      owner = "client!uf",
      name = "e",
      descriptor = "I"
   )
   public static int field6827;
   @OriginalMember(
      owner = "client!uf",
      name = "i",
      descriptor = "[I"
   )
   public static int[] field6824;

   @OriginalMember(
      owner = "client!uf",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method3448(byte arg0) {
      try {
         class80 var2 = this.field6819;
         synchronized(this.field6819) {
            this.field6819.method715(true);
         }

         if (arg0 != -114) {
            method3452(100, (byte[])null, 71, -19);
         }

         ++field6818;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field6830[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uf",
      name = "a",
      descriptor = "(BI)Z"
   )
   public static final boolean method3449(byte arg0, int arg1) {
      try {
         ++field6822;
         if (arg0 <= 33) {
            return true;
         } else {
            return arg1 == 3 || arg1 == 5 || ~arg1 == -7;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field6830[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uf",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method3450(int arg0, int arg1) {
      try {
         class80 var3 = this.field6819;
         synchronized(this.field6819) {
            this.field6819.method726(arg1, 25324);
         }

         ++field6820;
         if (arg0 != -29921) {
            method3449((byte)-110, -60);
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field6830[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uf",
      name = "a",
      descriptor = "(IB)Lwha;"
   )
   public final class298 method3451(int arg0, byte arg1) {
      try {
         if (arg1 != 104) {
            this.method3450(-127, 59);
         }

         ++field6826;
         class80 var3 = this.field6819;
         class298 var4;
         synchronized(this.field6819) {
            var4 = (class298)this.field6819.method725(0, (long)arg0);
         }

         if (var4 != null) {
            return var4;
         } else {
            class266 var5 = this.field6825;
            byte[] var6;
            synchronized(this.field6825) {
               var6 = this.field6825.method2037(false, arg0, 26);
            }

            class298 var7 = new class298();
            if (var6 != null) {
               var7.method2228(7000, new class147(var6));
            }

            class80 var8 = this.field6819;
            synchronized(this.field6819) {
               this.field6819.method723(0, (long)arg0, var7);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field6830[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uf",
      name = "a",
      descriptor = "(I[BII)[B"
   )
   public static final byte[] method3452(int arg0, byte[] arg1, int arg2, int arg3) {
      boolean var4 = client.field4360;

      try {
         byte[] var5;
         label37: {
            ++field6821;
            if (arg3 <= 0) {
               var5 = arg1;
               if (!var4) {
                  break label37;
               }
            }

            var5 = new byte[arg2];
            int var6 = 0;
            if (var4 || var6 < arg2) {
               do {
                  var5[var6] = arg1[arg3 + var6];
                  ++var6;
               } while(var6 < arg2);
            }
         }

         class769 var7 = new class769();
         var7.method5568(-90);
         var7.method5570((byte)-97, (long)(arg2 * 8), var5);
         byte[] var8 = new byte[64];
         var7.method5571(var8, arg0, 6);
         return var8;
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field6830[3] + arg0 + ',' + (arg1 != null ? field6830[2] : field6830[1]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uf",
      name = "<init>",
      descriptor = "(Lno;ILkf;)V"
   )
   public class474(class732 arg0, int arg1, class266 arg2) {
      try {
         this.field6825 = arg2;
         this.field6825.method2060(2, 26);
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field6830[9] + (arg0 != null ? field6830[2] : field6830[1]) + ',' + arg1 + ',' + (arg2 != null ? field6830[2] : field6830[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uf",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method3453(int arg0) {
      try {
         field6828 = null;
         field6824 = null;
         if (arg0 != 64) {
            method3449((byte)65, -43);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field6830[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uf",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method3454(int arg0) {
      try {
         if (arg0 == 3) {
            ++field6823;
            class80 var2 = this.field6819;
            synchronized(this.field6819) {
               this.field6819.method731(0);
            }
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field6830[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3455(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 5);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3456(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 47;
            break;
         case 1:
            var10005 = 44;
            break;
         case 2:
            var10005 = 25;
            break;
         case 3:
            var10005 = 102;
            break;
         default:
            var10005 = 5;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
