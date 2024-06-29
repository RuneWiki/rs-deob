import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class512 {
   @OriginalMember(
      owner = "client!rd",
      name = "b",
      descriptor = "Lsia;"
   )
   private class407 field7143 = new class407(64);
   @OriginalMember(
      owner = "client!rd",
      name = "k",
      descriptor = "Lsia;"
   )
   public class407 field7146 = new class407(60);
   @OriginalMember(
      owner = "client!rd",
      name = "f",
      descriptor = "Lww;"
   )
   private class339 field7145;
   @OriginalMember(
      owner = "client!rd",
      name = "i",
      descriptor = "Lww;"
   )
   public class339 field7141;
   @OriginalMember(
      owner = "client!rd",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7148 = new String[]{method3868(method3867("\u0017\u001c\u0000Rd")), method3868(method3867("\u0017\u001c\u0000Td")), method3868(method3867("\u0017\u001c\u0000Vd")), method3868(method3867("\u0017\u001c\u0000Ud")), method3868(method3867("\u000b\rB{")), method3868(method3867("\u001eV\u000091")), method3868(method3867("\u0017\u001c\u0000+%\u000b\u0011Z)d")), method3868(method3867("\u0017\u001c\u0000Sd"))};
   @OriginalMember(
      owner = "client!rd",
      name = "a",
      descriptor = "I"
   )
   public static int field7138 = 0;
   @OriginalMember(
      owner = "client!rd",
      name = "h",
      descriptor = "I"
   )
   public static int field7137;
   @OriginalMember(
      owner = "client!rd",
      name = "d",
      descriptor = "I"
   )
   public static int field7139;
   @OriginalMember(
      owner = "client!rd",
      name = "e",
      descriptor = "I"
   )
   public static int field7140;
   @OriginalMember(
      owner = "client!rd",
      name = "j",
      descriptor = "I"
   )
   public static int field7142;
   @OriginalMember(
      owner = "client!rd",
      name = "c",
      descriptor = "I"
   )
   public static int field7144;
   @OriginalMember(
      owner = "client!rd",
      name = "g",
      descriptor = "I"
   )
   public int field7147;

   @OriginalMember(
      owner = "client!rd",
      name = "b",
      descriptor = "(BI)Lhha;"
   )
   public final class775 method3862(byte arg0, int arg1) {
      try {
         ++field7139;
         class407 var3 = this.field7143;
         class775 var4;
         synchronized(this.field7143) {
            var4 = (class775)this.field7143.method3192((long)arg1, (byte)-121);
         }

         if (var4 != null) {
            return var4;
         } else {
            class339 var5 = this.field7145;
            byte[] var6;
            synchronized(this.field7145) {
               var6 = this.field7145.method2697(class100.method903((byte)-118, arg1), class63.method561(arg1, 126), false);
            }

            if (arg0 != 74) {
               return null;
            } else {
               class775 var7 = new class775();
               var7.field11300 = this;
               var7.field11284 = arg1;
               if (var6 != null) {
                  var7.method5591(103, new class66(var6));
               }

               class407 var8 = this.field7143;
               synchronized(this.field7143) {
                  this.field7143.method3190(var7, (long)arg1, arg0 + -66);
                  return var7;
               }
            }
         }
      } catch (RuntimeException var13) {
         throw class93.method866(var13, field7148[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rd",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method3863(byte arg0, int arg1) {
      try {
         if (arg0 > 88) {
            ++field7137;
            this.field7147 = arg1;
            class407 var3 = this.field7146;
            synchronized(this.field7146) {
               this.field7146.method3201((byte)101);
            }
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field7148[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rd",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method3864(int arg0, boolean arg1) {
      try {
         if (!arg1) {
            class407 var3 = this.field7143;
            synchronized(this.field7143) {
               this.field7143.method3197(5, arg0);
            }

            ++field7144;
            class407 var4 = this.field7146;
            synchronized(this.field7146) {
               this.field7146.method3197(5, arg0);
            }
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field7148[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rd",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method3865(int arg0) {
      try {
         if (arg0 >= 31) {
            ++field7142;
            class407 var2 = this.field7143;
            synchronized(this.field7143) {
               this.field7143.method3201((byte)-41);
            }

            class407 var3 = this.field7146;
            synchronized(this.field7146) {
               this.field7146.method3201((byte)124);
            }
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field7148[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rd",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method3866(byte arg0) {
      try {
         class407 var2 = this.field7143;
         synchronized(this.field7143) {
            this.field7143.method3187(-23825);
         }

         ++field7140;
         class407 var3 = this.field7146;
         synchronized(this.field7146) {
            if (arg0 > -67) {
               this.method3862((byte)86, 11);
            }

            this.field7146.method3187(-23825);
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field7148[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rd",
      name = "<init>",
      descriptor = "(Lkb;ILww;Lww;)V"
   )
   public class512(class500 arg0, int arg1, class339 arg2, class339 arg3) {
      try {
         this.field7145 = arg2;
         this.field7141 = arg3;
         int var5 = -1 + this.field7145.method2703((byte)126);
         this.field7145.method2691(var5, 114);
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field7148[6] + (arg0 != null ? field7148[5] : field7148[4]) + ',' + arg1 + ',' + (arg2 != null ? field7148[5] : field7148[4]) + ',' + (arg3 != null ? field7148[5] : field7148[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3867(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 76);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3868(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 101;
            break;
         case 1:
            var10005 = 120;
            break;
         case 2:
            var10005 = 46;
            break;
         case 3:
            var10005 = 23;
            break;
         default:
            var10005 = 76;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
