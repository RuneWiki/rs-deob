import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class773 extends class31 {
   @OriginalMember(
      owner = "client!hd",
      name = "O",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11323 = new String[]{method5576(method5575("'\u001fZ7\u0001")), method5576(method5575("'\u001fZ0\u0001")), method5576(method5575("'\u001fZ6\u0001")), method5576(method5575("'\u001fZ2\u0001")), method5576(method5575("!\u000e\u0018\u0017")), method5576(method5575("4UZUT")), method5576(method5575("'\u001fZ1\u0001"))};
   @OriginalMember(
      owner = "client!hd",
      name = "J",
      descriptor = "B"
   )
   public byte field11321;
   @OriginalMember(
      owner = "client!hd",
      name = "L",
      descriptor = "I"
   )
   public static int field11315;
   @OriginalMember(
      owner = "client!hd",
      name = "M",
      descriptor = "I"
   )
   public static int field11316;
   @OriginalMember(
      owner = "client!hd",
      name = "H",
      descriptor = "I"
   )
   public int field11319;
   @OriginalMember(
      owner = "client!hd",
      name = "G",
      descriptor = "I"
   )
   public static int field11320;
   @OriginalMember(
      owner = "client!hd",
      name = "K",
      descriptor = "I"
   )
   public static int field11322;
   @OriginalMember(
      owner = "client!hd",
      name = "N",
      descriptor = "Ljj;"
   )
   public class128 field11318;
   @OriginalMember(
      owner = "client!hd",
      name = "I",
      descriptor = "Lwba;"
   )
   public static class55 field11317;

   @OriginalMember(
      owner = "client!hd",
      name = "a",
      descriptor = "(Z)I"
   )
   public final int method220(boolean arg0) {
      try {
         ++field11315;
         if (!arg0) {
            return -111;
         } else {
            return this.field11318 == null ? 0 : this.field11318.field1590 * 100 / (this.field11318.field1552.length + -this.field11321);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field11323[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hd",
      name = "c",
      descriptor = "(Z)V"
   )
   public static final void method5572(boolean arg0) {
      int var1 = client.field4530;

      try {
         if (!arg0) {
            method5574((byte[])null, 15, 83, 96);
         }

         ++field11320;
         int var2 = 0;
         if (var1 != 0 || class65.field797.length > var2) {
            do {
               int var3 = 0;
               if (var1 != 0 || var3 < class65.field797[0].length) {
                  do {
                     int var4 = 0;
                     if (var1 != 0) {
                        class65.field797[var2][var3][var4] = 0;
                        ++var4;
                     }

                     while(true) {
                        while(class65.field797[0][0].length > var4) {
                           class65.field797[var2][var3][var4] = 0;
                           ++var4;
                        }

                        if (var1 == 0) {
                           ++var3;
                           break;
                        }

                        ++var4;
                     }
                  } while(var3 < class65.field797[0].length);
               }

               ++var2;
            } while(class65.field797.length > var2);

         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field11323[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hd",
      name = "b",
      descriptor = "(Z)[B"
   )
   public final byte[] method222(boolean arg0) {
      try {
         if (!arg0) {
            this.field11321 = 54;
         }

         ++field11316;
         if (!super.field341 && ~this.field11318.field1590 <= ~(this.field11318.field1552.length + -this.field11321)) {
            return this.field11318.field1552;
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field11323[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hd",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method5573(int arg0) {
      try {
         field11317 = null;
         if (arg0 != 0) {
            method5574((byte[])null, 40, -58, -90);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field11323[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hd",
      name = "a",
      descriptor = "([BIII)[B"
   )
   public static final byte[] method5574(byte[] arg0, int arg1, int arg2, int arg3) {
      try {
         ++field11322;
         byte[] var4 = new byte[arg3];
         class195.method1492(arg0, arg2, var4, arg1, arg3);
         return var4;
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field11323[6] + (arg0 != null ? field11323[5] : field11323[4]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5575(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 41);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5576(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 79;
            break;
         case 1:
            var10005 = 123;
            break;
         case 2:
            var10005 = 116;
            break;
         case 3:
            var10005 = 123;
            break;
         default:
            var10005 = 41;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
