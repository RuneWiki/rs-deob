import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class577 extends class580 {
   @OriginalMember(
      owner = "client!nl",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8574 = new String[]{method4263(method4262(".v\u001c\u0003%")), method4263(method4262(".v\u001c\u0005%")), method4263(method4262(".o^+")), method4263(method4262(";4\u001cip")), method4263(method4262(".v\u001c\u0006%")), method4263(method4262(".v\u001c\u0004%"))};
   @OriginalMember(
      owner = "client!nl",
      name = "w",
      descriptor = "Z"
   )
   public static boolean field8566 = false;
   @OriginalMember(
      owner = "client!nl",
      name = "t",
      descriptor = "Z"
   )
   public static boolean field8570 = false;
   @OriginalMember(
      owner = "client!nl",
      name = "v",
      descriptor = "B"
   )
   private byte field8563;
   @OriginalMember(
      owner = "client!nl",
      name = "z",
      descriptor = "B"
   )
   private byte field8569;
   @OriginalMember(
      owner = "client!nl",
      name = "A",
      descriptor = "I"
   )
   public static int field8562;
   @OriginalMember(
      owner = "client!nl",
      name = "u",
      descriptor = "I"
   )
   public static int field8564;
   @OriginalMember(
      owner = "client!nl",
      name = "y",
      descriptor = "I"
   )
   public static int field8565;
   @OriginalMember(
      owner = "client!nl",
      name = "s",
      descriptor = "I"
   )
   public static int field8567;
   @OriginalMember(
      owner = "client!nl",
      name = "x",
      descriptor = "I"
   )
   public static int field8568;
   @OriginalMember(
      owner = "client!nl",
      name = "q",
      descriptor = "I"
   )
   public static int field8571;
   @OriginalMember(
      owner = "client!nl",
      name = "r",
      descriptor = "I"
   )
   public static int field8573;
   @OriginalMember(
      owner = "client!nl",
      name = "p",
      descriptor = "Ljava/lang/String;"
   )
   private String field8572;

   @OriginalMember(
      owner = "client!nl",
      name = "a",
      descriptor = "(Lef;B)I",
      line = 4
   )
   public static final int method4260(class513 arg0, byte arg1) {
      try {
         if (arg1 <= 99) {
            return 97;
         } else {
            ++field8565;
            if (class513.field7516 == arg0) {
               return 5120;
            } else if (class513.field7517 == arg0) {
               return 5122;
            } else if (class513.field7518 != arg0) {
               if (class513.field7519 == arg0) {
                  return 5121;
               } else if (class513.field7520 == arg0) {
                  return 5123;
               } else if (class513.field7521 == arg0) {
                  return 5125;
               } else if (class513.field7522 == arg0) {
                  return 5131;
               } else if (class513.field7523 == arg0) {
                  return 5126;
               } else {
                  throw new IllegalArgumentException("");
               }
            } else {
               return 5124;
            }
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field8574[5] + (arg0 != null ? field8574[3] : field8574[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nl",
      name = "a",
      descriptor = "(ILjj;)V",
      line = 49
   )
   public final void method514(int arg0, class128 arg1) {
      try {
         this.field8572 = arg1.method1056(-20330);
         ++field8571;
         if (arg0 != 15) {
            field8568 = -64;
         }

         if (this.field8572 != null) {
            arg1.method1104(255);
            this.field8563 = arg1.method1047((byte)-99);
            this.field8569 = arg1.method1047((byte)-110);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field8574[4] + arg0 + ',' + (arg1 != null ? field8574[3] : field8574[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nl",
      name = "a",
      descriptor = "(Lki;B)V",
      line = 83
   )
   public final void method513(class736 arg0, byte arg1) {
      try {
         arg0.field10929 = this.field8572;
         ++field8562;
         if (arg1 == 94) {
            if (this.field8572 != null) {
               arg0.field10926 = this.field8563;
               arg0.field10930 = this.field8569;
            }
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field8574[1] + (arg0 != null ? field8574[3] : field8574[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nl",
      name = "a",
      descriptor = "(BI)V",
      line = 107
   )
   public static final void method4261(byte arg0, int arg1) {
      try {
         ++field8564;
         if (~class672.field10112 == -8) {
            if (~class777.field11357 == -1 && ~class578.field8576 == -1) {
               class149.field1859 = arg1;
               class317.method2411(9, (byte)102);
               if (arg0 != 87) {
                  field8573 = 62;
               }
            }
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field8574[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4262(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 13);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4263(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 64;
            break;
         case 1:
            var10005 = 26;
            break;
         case 2:
            var10005 = 50;
            break;
         case 3:
            var10005 = 71;
            break;
         default:
            var10005 = 13;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
