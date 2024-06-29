import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class363 implements class534 {
   @OriginalMember(
      owner = "client!vq",
      name = "i",
      descriptor = "Lrja;"
   )
   private class494 field5357;
   @OriginalMember(
      owner = "client!vq",
      name = "b",
      descriptor = "Lsa;"
   )
   private class39 field5356;
   @OriginalMember(
      owner = "client!vq",
      name = "g",
      descriptor = "Lsa;"
   )
   private class39 field5361;
   @OriginalMember(
      owner = "client!vq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5365 = new String[]{method2855(method2854("5\r\u0010\r=")), method2855(method2854("8R\u0010kh")), method2855(method2854("5\r\u0010y|-\u0015J{=")), method2855(method2854("-\tR)")), method2855(method2854("5\r\u0010\u0002=")), method2855(method2854("5\r\u0010\f=")), method2855(method2854("5\r\u0010\u0004=")), method2855(method2854("5\r\u0010\u0007="))};
   @OriginalMember(
      owner = "client!vq",
      name = "a",
      descriptor = "Z"
   )
   public static boolean field5364 = false;
   @OriginalMember(
      owner = "client!vq",
      name = "h",
      descriptor = "I"
   )
   public static int field5358;
   @OriginalMember(
      owner = "client!vq",
      name = "c",
      descriptor = "I"
   )
   public static int field5359;
   @OriginalMember(
      owner = "client!vq",
      name = "f",
      descriptor = "I"
   )
   public static int field5360;
   @OriginalMember(
      owner = "client!vq",
      name = "j",
      descriptor = "I"
   )
   public static int field5362;
   @OriginalMember(
      owner = "client!vq",
      name = "d",
      descriptor = "I"
   )
   public static int field5363;
   @OriginalMember(
      owner = "client!vq",
      name = "e",
      descriptor = "Lda;"
   )
   private class216 field5355;

   @OriginalMember(
      owner = "client!vq",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method984(int arg0) {
      try {
         ++field5362;
         boolean var2 = true;
         if (!this.field5361.method450(0, this.field5357.field7050)) {
            var2 = false;
         }

         if (arg0 <= 67) {
            this.field5356 = null;
         }

         if (!this.field5356.method450(0, this.field5357.field7050)) {
            var2 = false;
         }

         return var2;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field5365[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vq",
      name = "a",
      descriptor = "([[BLeh;B)V"
   )
   public static final void method2852(byte[][] arg0, class543 arg1, byte arg2) {
      boolean var3 = client.field10022;

      try {
         if (arg2 <= -67) {
            ++field5363;
            int var4 = class168.field2520.length;
            int var5 = 0;
            if (var3 || var5 < var4) {
               do {
                  byte[] var6 = arg0[var5];
                  if (var6 != null) {
                     int var7 = (class460.field6709[var5] >> 8) * 64 - class115.field1824;
                     int var8 = (class460.field6709[var5] & 255) * 64 + -class480.field6903;
                     class622.method4576((byte)-76);
                     arg1.method4047(class100.field1588, class54.field794, var6, var7, var8, 100);
                  }

                  ++var5;
               } while(var5 < var4);

            }
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field5365[7] + (arg0 != null ? field5365[1] : field5365[3]) + ',' + (arg1 != null ? field5365[1] : field5365[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vq",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method983(boolean arg0, int arg1) {
      try {
         ++field5358;
         if (arg0) {
            int var3 = this.field5357.field7045.method4636(class111.field1737, (byte)-56, this.field5357.field7046) - -this.field5357.field7049;
            int var4 = this.field5357.field7048.method5290(this.field5357.field7039, class595.field8386, 105) + this.field5357.field7052;
            this.field5355.method1870(0, (int[])null, this.field5357.field7040, var4, this.field5357.field7053, var3, this.field5357.field7043, this.field5357.field7041, this.field5357.field7047, (class684)null, this.field5357.field7044, this.field5357.field7046, (byte)-125, (class148[])null, this.field5357.field7039, 0);
         }

         if (arg1 >= -55) {
            this.field5355 = null;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field5365[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vq",
      name = "a",
      descriptor = "(Ljga;B)Ljga;"
   )
   public static final class91 method2853(class91 arg0, byte arg1) {
      boolean var2 = client.field10022;

      try {
         ++field5359;
         if (arg0.field1407 != -1) {
            return class460.method3554(-78, arg0.field1407);
         } else {
            int var3 = arg0.field1356 >>> 16;
            class704 var4 = new class704(class139.field2228);
            if (arg1 != 12) {
               method2852((byte[][])null, (class543)null, (byte)-102);
            }

            class733 var5 = (class733)var4.method5138(114);
            if (var2) {
               if (var5.field10417 == var3) {
                  return class460.method3554(-99, (int)var5.field3777);
               }

               var5 = (class733)var4.method5136(122);
            }

            while(true) {
               while(var5 != null) {
                  if (var5.field10417 == var3) {
                     return class460.method3554(-99, (int)var5.field3777);
                  }

                  var5 = (class733)var4.method5136(122);
               }

               if (!var2) {
                  return null;
               }

               var5 = (class733)var4.method5136(122);
            }
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field5365[6] + (arg0 != null ? field5365[1] : field5365[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vq",
      name = "<init>",
      descriptor = "(Lsa;Lsa;Lrja;)V"
   )
   public class363(class39 arg0, class39 arg1, class494 arg2) {
      try {
         this.field5357 = arg2;
         this.field5356 = arg1;
         this.field5361 = arg0;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field5365[2] + (arg0 != null ? field5365[1] : field5365[3]) + ',' + (arg1 != null ? field5365[1] : field5365[3]) + ',' + (arg2 != null ? field5365[1] : field5365[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vq",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method988(byte arg0) {
      try {
         ++field5360;
         class440 var2 = class604.method4453(this.field5357.field7050, 29306, this.field5356);
         if (arg0 >= 88) {
            this.field5355 = class54.field794.method170(var2, class433.method3381(this.field5361, this.field5357.field7050), true);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field5365[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2854(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 21);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2855(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 67;
            break;
         case 1:
            var10005 = 124;
            break;
         case 2:
            var10005 = 62;
            break;
         case 3:
            var10005 = 69;
            break;
         default:
            var10005 = 21;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
