import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public abstract class class616 extends class604 {
   @OriginalMember(
      owner = "client!vs",
      name = "j",
      descriptor = "Z"
   )
   public boolean field8997 = false;
   @OriginalMember(
      owner = "client!vs",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9012 = new String[]{method4473(method4472("!N(Q\u0018\u007f")), method4473(method4472("9Hju")), method4473(method4472("!N(Q\u001b\u007f")), method4473(method4472(",\u0013(7$")), method4473(method4472("!N(^\u001b\u007f")), method4473(method4472("!N(P\u001b\u007f"))};
   @OriginalMember(
      owner = "client!vs",
      name = "q",
      descriptor = "Lsd;"
   )
   public static class101 field9009 = new class101(52, -1);
   @OriginalMember(
      owner = "client!vs",
      name = "i",
      descriptor = "B"
   )
   public byte field9005;
   @OriginalMember(
      owner = "client!vs",
      name = "r",
      descriptor = "B"
   )
   public byte field9010;
   @OriginalMember(
      owner = "client!vs",
      name = "v",
      descriptor = "I"
   )
   public int field8998;
   @OriginalMember(
      owner = "client!vs",
      name = "o",
      descriptor = "I"
   )
   public static int field8999;
   @OriginalMember(
      owner = "client!vs",
      name = "s",
      descriptor = "I"
   )
   public int field9000;
   @OriginalMember(
      owner = "client!vs",
      name = "k",
      descriptor = "I"
   )
   public int field9001;
   @OriginalMember(
      owner = "client!vs",
      name = "p",
      descriptor = "I"
   )
   public static int field9002;
   @OriginalMember(
      owner = "client!vs",
      name = "x",
      descriptor = "I"
   )
   public int field9003;
   @OriginalMember(
      owner = "client!vs",
      name = "w",
      descriptor = "I"
   )
   public static int field9004;
   @OriginalMember(
      owner = "client!vs",
      name = "u",
      descriptor = "I"
   )
   public int field9006;
   @OriginalMember(
      owner = "client!vs",
      name = "n",
      descriptor = "I"
   )
   public int field9007;
   @OriginalMember(
      owner = "client!vs",
      name = "t",
      descriptor = "Lvs;"
   )
   public class616 field8996;
   @OriginalMember(
      owner = "client!vs",
      name = "l",
      descriptor = "Lha;"
   )
   public static class66 field9011;
   @OriginalMember(
      owner = "client!vs",
      name = "m",
      descriptor = "Z"
   )
   public boolean field9008;

   @OriginalMember(
      owner = "client!vs",
      name = "a",
      descriptor = "(I[Llja;IB)I",
      line = 7
   )
   public final int method4469(int arg0, class744[] arg1, int arg2, byte arg3) {
      int var5 = client.field4530;

      try {
         int var10;
         int var11;
         label61: {
            ++field8999;
            long var6 = class544.field8093[this.field9010][arg0][arg2];
            long var8 = 0L;
            var10 = 0;
            if (var5 != 0) {
               var11 = (int)(var6 >> (int)var8 & 65535L);
            } else if (var8 > 48L) {
               var11 = var10;
               if (var5 == 0) {
                  break label61;
               }
            } else {
               var11 = (int)(var6 >> (int)var8 & 65535L);
            }

            label60:
            do {
               while(true) {
                  if (var11 <= 0) {
                     if (var5 == 0) {
                        var11 = var10;
                        break;
                     }

                     arg1[var10++] = class535.field7812[var11 + -1].field356;
                     var8 += 16L;
                  } else {
                     arg1[var10++] = class535.field7812[var11 + -1].field356;
                     var8 += 16L;
                  }

                  if (var8 > 48L) {
                     var11 = var10;
                     if (var5 == 0) {
                        break label60;
                     }
                  } else {
                     var11 = (int)(var6 >> (int)var8 & 65535L);
                  }
               }
            } while(var5 != 0);
         }

         if (var5 != 0) {
            arg1[var11] = null;
            ++var11;
         }

         while(true) {
            while(~var11 > -5) {
               arg1[var11] = null;
               ++var11;
            }

            if (var5 == 0) {
               if (arg3 != -5) {
                  this.field9010 = -56;
               }

               return var10;
            }

            ++var11;
         }
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field9012[2] + arg0 + ',' + (arg1 != null ? field9012[3] : field9012[1]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vs",
      name = "l",
      descriptor = "(I)V",
      line = 55
   )
   public static final void method4470(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!vs",
      name = "c",
      descriptor = "(B)I",
      line = 452
   )
   public int method1282(byte arg0) {
      try {
         ++field9004;
         if (arg0 != 5) {
            this.method1282((byte)-18);
         }

         return 0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field9012[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vs",
      name = "i",
      descriptor = "(I)V",
      line = 465
   )
   public static void method4471(int arg0) {
      try {
         field9009 = null;
         if (arg0 != -1) {
            method4470(-41);
         }

         field9011 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field9012[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vs",
      name = "g",
      descriptor = "(I)V"
   )
   public abstract void method3(int arg0);

   @OriginalMember(
      owner = "client!vs",
      name = "j",
      descriptor = "(I)Z"
   )
   public abstract boolean method5(int arg0);

   @OriginalMember(
      owner = "client!vs",
      name = "a",
      descriptor = "(BLha;)Z"
   )
   public abstract boolean method1880(byte arg0, class66 arg1);

   @OriginalMember(
      owner = "client!vs",
      name = "b",
      descriptor = "(ILha;)Lcka;"
   )
   public abstract class185 method16(int arg0, class66 arg1);

   @OriginalMember(
      owner = "client!vs",
      name = "h",
      descriptor = "(I)Z"
   )
   public abstract boolean method2(int arg0);

   @OriginalMember(
      owner = "client!vs",
      name = "a",
      descriptor = "(Z)Z"
   )
   public abstract boolean method1883(boolean arg0);

   @OriginalMember(
      owner = "client!vs",
      name = "a",
      descriptor = "([Llja;I)I"
   )
   public abstract int method1881(class744[] arg0, int arg1);

   @OriginalMember(
      owner = "client!vs",
      name = "f",
      descriptor = "(I)I"
   )
   public abstract int method6(int arg0);

   @OriginalMember(
      owner = "client!vs",
      name = "a",
      descriptor = "(IILha;I)Z"
   )
   public abstract boolean method20(int arg0, int arg1, class66 arg2, int arg3);

   @OriginalMember(
      owner = "client!vs",
      name = "a",
      descriptor = "(ILha;IZIBLvs;)V"
   )
   public abstract void method18(int arg0, class66 arg1, int arg2, boolean arg3, int arg4, byte arg5, class616 arg6);

   @OriginalMember(
      owner = "client!vs",
      name = "b",
      descriptor = "(Lha;I)V"
   )
   public abstract void method4(class66 arg0, int arg1);

   @OriginalMember(
      owner = "client!vs",
      name = "k",
      descriptor = "(I)I"
   )
   public abstract int method11(int arg0);

   @OriginalMember(
      owner = "client!vs",
      name = "a",
      descriptor = "(Lha;I)Lvw;"
   )
   public abstract class319 method10(class66 arg0, int arg1);

   @OriginalMember(
      owner = "client!vs",
      name = "d",
      descriptor = "(B)Z"
   )
   public abstract boolean method19(byte arg0);

   @OriginalMember(
      owner = "client!vs",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4472(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 89);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vs",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4473(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 87;
            break;
         case 1:
            var10005 = 61;
            break;
         case 2:
            var10005 = 6;
            break;
         case 3:
            var10005 = 25;
            break;
         default:
            var10005 = 89;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
