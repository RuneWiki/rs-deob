import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oja")
public class class477 {
   @OriginalMember(
      owner = "client!oja",
      name = "h",
      descriptor = "Ldw;"
   )
   private class748 field7092 = new class748(64);
   @OriginalMember(
      owner = "client!oja",
      name = "i",
      descriptor = "Leaa;"
   )
   private class526 field7088;
   @OriginalMember(
      owner = "client!oja",
      name = "e",
      descriptor = "I"
   )
   public int field7090;
   @OriginalMember(
      owner = "client!oja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7095 = new String[]{method3541(method3540("\u0016)[\u0006I")), method3541(method3540("\u0002m\u0014\u0006pE")), method3541(method3540("\u0003r\u0019D")), method3541(method3540("\u0002m\u0014\u0006wE")), method3541(method3540("\u0002m\u0014\u0006qE")), method3541(method3540("\u0002m\u0014\u0006\b\u0004i\u001c\\\nE")), method3541(method3540("\u0002m\u0014\u0006uE")), method3541(method3540("\u0002m\u0014\u0006vE"))};
   @OriginalMember(
      owner = "client!oja",
      name = "b",
      descriptor = "I"
   )
   public static int field7086;
   @OriginalMember(
      owner = "client!oja",
      name = "c",
      descriptor = "I"
   )
   public static int field7087;
   @OriginalMember(
      owner = "client!oja",
      name = "g",
      descriptor = "I"
   )
   public static int field7089;
   @OriginalMember(
      owner = "client!oja",
      name = "f",
      descriptor = "I"
   )
   public static int field7091;
   @OriginalMember(
      owner = "client!oja",
      name = "a",
      descriptor = "I"
   )
   public static int field7093;
   @OriginalMember(
      owner = "client!oja",
      name = "d",
      descriptor = "I"
   )
   public static int field7094;

   @OriginalMember(
      owner = "client!oja",
      name = "a",
      descriptor = "(B)V",
      line = 3
   )
   public final void method3535(byte arg0) {
      try {
         class748 var2 = this.field7092;
         synchronized(this.field7092) {
            this.field7092.method5445(697465426);
         }

         ++field7089;
         if (arg0 != -113) {
            this.field7090 = -121;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field7095[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oja",
      name = "a",
      descriptor = "(BCLjava/lang/String;)I",
      line = 21
   )
   public static final int method3536(byte arg0, char arg1, String arg2) {
      int var3 = client.field4530;

      try {
         ++field7091;
         int var4 = 0;
         int var5 = arg2.length();
         if (arg0 < 115) {
            method3536((byte)-100, '\u0017', (String)null);
         }

         int var6 = 0;
         if (var3 != 0) {
            if (arg2.charAt(var6) == arg1) {
               ++var4;
            }

            ++var6;
         }

         while(true) {
            int var10000;
            if (var5 <= var6) {
               var10000 = var4;
               if (var3 == 0) {
                  return var4;
               }
            } else {
               var10000 = arg2.charAt(var6);
            }

            if (var10000 == arg1) {
               ++var4;
            }

            ++var6;
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field7095[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7095[0] : field7095[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!oja",
      name = "a",
      descriptor = "(ZI)V",
      line = 48
   )
   public final void method3537(boolean arg0, int arg1) {
      try {
         class748 var3 = this.field7092;
         synchronized(this.field7092) {
            this.field7092.method5453(arg1, false);
         }

         if (!arg0) {
            this.method3537(true, -111);
         }

         ++field7086;
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field7095[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oja",
      name = "a",
      descriptor = "(I)V",
      line = 63
   )
   public final void method3538(int arg0) {
      try {
         if (arg0 != 0) {
            this.method3538(-95);
         }

         class748 var2 = this.field7092;
         synchronized(this.field7092) {
            this.field7092.method5451(-124);
         }

         ++field7093;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field7095[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oja",
      name = "<init>",
      descriptor = "(Lqo;ILeaa;)V",
      line = 86
   )
   public class477(class24 arg0, int arg1, class526 arg2) {
      try {
         this.field7088 = arg2;
         if (this.field7088 == null) {
            this.field7090 = 0;
         } else {
            this.field7090 = this.field7088.method3875(0, 16);
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field7095[5] + (arg0 != null ? field7095[0] : field7095[2]) + ',' + arg1 + ',' + (arg2 != null ? field7095[0] : field7095[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!oja",
      name = "a",
      descriptor = "(II)Laba;",
      line = 103
   )
   public final class187 method3539(int arg0, int arg1) {
      try {
         ++field7087;
         class748 var3 = this.field7092;
         class187 var4;
         synchronized(this.field7092) {
            var4 = (class187)this.field7092.method5454((long)arg0, 18261);
         }

         if (var4 != null) {
            return var4;
         } else {
            if (arg1 >= -104) {
               field7094 = -88;
            }

            class526 var5 = this.field7088;
            byte[] var6;
            synchronized(this.field7088) {
               var6 = this.field7088.method3899(-42, arg0, 16);
            }

            class187 var7 = new class187();
            if (var6 != null) {
               var7.method1455(new class128(var6), -1);
            }

            class748 var8 = this.field7092;
            synchronized(this.field7092) {
               this.field7092.method5455(-2049, var7, (long)arg0);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field7095[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3540(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 52);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3541(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 109;
            break;
         case 1:
            var10005 = 7;
            break;
         case 2:
            var10005 = 117;
            break;
         case 3:
            var10005 = 40;
            break;
         default:
            var10005 = 52;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
