import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kia")
public class class649 {
   @OriginalMember(
      owner = "client!kia",
      name = "m",
      descriptor = "Z"
   )
   public boolean field9478 = true;
   @OriginalMember(
      owner = "client!kia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9483 = new String[]{method4733(method4732("\u000f\u0000\u001e:")), method4733(method4732("\u001a[\\xU")), method4733(method4732("\n\u001c\u0013xnI")), method4733(method4732("\n\u001c\u0013xlI")), method4733(method4732("\n\u001c\u0013xjI")), method4733(method4732("\n\u001c\u0013xiI")), method4733(method4732("\n\u001c\u0013xkI")), method4733(method4732("\n\u001c\u0013xmI")), method4733(method4732("\n\u001c\u0013xoI"))};
   @OriginalMember(
      owner = "client!kia",
      name = "f",
      descriptor = "I"
   )
   public static int field9476 = 0;
   @OriginalMember(
      owner = "client!kia",
      name = "i",
      descriptor = "Lwu;"
   )
   public static class395 field9475 = new class395(11, 0, 1, 2);
   @OriginalMember(
      owner = "client!kia",
      name = "e",
      descriptor = "Lwu;"
   )
   public static class395 field9482 = new class395(13, 0, 1, 0);
   @OriginalMember(
      owner = "client!kia",
      name = "c",
      descriptor = "C"
   )
   private char field9479;
   @OriginalMember(
      owner = "client!kia",
      name = "d",
      descriptor = "I"
   )
   public static int field9469;
   @OriginalMember(
      owner = "client!kia",
      name = "h",
      descriptor = "I"
   )
   public static int field9470;
   @OriginalMember(
      owner = "client!kia",
      name = "g",
      descriptor = "I"
   )
   public static int field9471;
   @OriginalMember(
      owner = "client!kia",
      name = "b",
      descriptor = "I"
   )
   public static int field9472;
   @OriginalMember(
      owner = "client!kia",
      name = "k",
      descriptor = "I"
   )
   public static int field9473;
   @OriginalMember(
      owner = "client!kia",
      name = "n",
      descriptor = "I"
   )
   public int field9474;
   @OriginalMember(
      owner = "client!kia",
      name = "a",
      descriptor = "I"
   )
   public static int field9477;
   @OriginalMember(
      owner = "client!kia",
      name = "j",
      descriptor = "I"
   )
   public static int field9480;
   @OriginalMember(
      owner = "client!kia",
      name = "l",
      descriptor = "Ljava/lang/String;"
   )
   public String field9481;

   @OriginalMember(
      owner = "client!kia",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method4725(boolean arg0) {
      try {
         ++field9477;
         if (!arg0) {
            this.method4728(-43, (class147)null, -76);
         }

         return this.field9479 == 's';
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9483[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kia",
      name = "a",
      descriptor = "(BLwf;)V"
   )
   public final void method4726(byte arg0, class147 arg1) {
      boolean var3 = client.field4360;

      try {
         if (arg0 > -11) {
            method4730(102, (byte)65, (byte[])null, -60);
         }

         ++field9471;

         do {
            int var4 = arg1.method1143(-15465);
            if (var4 == 0) {
               break;
            }

            this.method4728(var4, arg1, -4198);
         } while(!var3);

      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field9483[3] + arg0 + ',' + (arg1 != null ? field9483[1] : field9483[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kia",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method4727(int arg0) {
      try {
         class195.field2767.method1777(true);
         ++field9470;
         class611.field8968.method1656(4096);
         class220.field3148.method2348(arg0 ^ -2);
         class557.field7990.setBackground(Color.black);
         class179.field2465 = arg0;
         class195.field2767 = class657.method4806(arg0 ^ 28903, class557.field7990);
         class611.field8968 = class93.method804(true, false, class557.field7990);
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field9483[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kia",
      name = "a",
      descriptor = "(ILwf;I)V"
   )
   private final void method4728(int arg0, class147 arg1, int arg2) {
      boolean var4 = client.field4360;

      try {
         if (arg2 != -4198) {
            field9476 = 13;
         }

         label52: {
            if (~arg0 == -2) {
               this.field9479 = class312.method2306(true, arg1.method1162(4));
               if (!var4) {
                  break label52;
               }
            }

            if (arg0 != 2) {
               if (~arg0 == -5) {
                  this.field9478 = false;
                  if (!var4) {
                     break label52;
                  }
               }

               if (arg0 != 5) {
                  break label52;
               }

               this.field9481 = arg1.method1204(2119550368);
               if (!var4) {
                  break label52;
               }
            }

            this.field9474 = arg1.method1164(19693);
         }

         ++field9472;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field9483[2] + arg0 + ',' + (arg1 != null ? field9483[1] : field9483[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kia",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method4729(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!kia",
      name = "a",
      descriptor = "(IB[BI)[B"
   )
   public static final byte[] method4730(int arg0, byte arg1, byte[] arg2, int arg3) {
      try {
         if (arg1 != -36) {
            return null;
         } else {
            ++field9469;
            byte[] var4 = new byte[arg0];
            class242.method1848(arg2, arg3, var4, 0, arg0);
            return var4;
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field9483[8] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9483[1] : field9483[0]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kia",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method4731(byte arg0) {
      try {
         field9482 = null;
         if (arg0 == 40) {
            field9475 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field9483[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4732(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 40);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4733(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 97;
            break;
         case 1:
            var10005 = 117;
            break;
         case 2:
            var10005 = 114;
            break;
         case 3:
            var10005 = 86;
            break;
         default:
            var10005 = 40;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
