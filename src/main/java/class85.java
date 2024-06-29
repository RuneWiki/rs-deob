import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aka")
public class class85 extends class546 {
   @OriginalMember(
      owner = "client!aka",
      name = "B",
      descriptor = "Ljava/lang/String;"
   )
   public String field1101;
   @OriginalMember(
      owner = "client!aka",
      name = "y",
      descriptor = "Lhha;"
   )
   public class549 field1105;
   @OriginalMember(
      owner = "client!aka",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1107 = new String[]{method835(method834("3ccD\u0010z")), method835(method834("3ccD\u0017z")), method835(method834("3ccD\u0011z")), method835(method834("<}n\u0006")), method835(method834(")&,D/")), method835(method834("3ccDn;fk\u001elz")), method835(method834("3ccD\u0013z")), method835(method834("3ccD\u0014z")), method835(method834("3ccD\u0016z"))};
   @OriginalMember(
      owner = "client!aka",
      name = "C",
      descriptor = "I"
   )
   public static int field1097;
   @OriginalMember(
      owner = "client!aka",
      name = "z",
      descriptor = "I"
   )
   public int field1099;
   @OriginalMember(
      owner = "client!aka",
      name = "A",
      descriptor = "I"
   )
   public static int field1102;
   @OriginalMember(
      owner = "client!aka",
      name = "t",
      descriptor = "I"
   )
   public static int field1103;
   @OriginalMember(
      owner = "client!aka",
      name = "w",
      descriptor = "I"
   )
   public static int field1104;
   @OriginalMember(
      owner = "client!aka",
      name = "x",
      descriptor = "I"
   )
   public static int field1106;
   @OriginalMember(
      owner = "client!aka",
      name = "u",
      descriptor = "Lq;"
   )
   public static class454 field1100;
   @OriginalMember(
      owner = "client!aka",
      name = "v",
      descriptor = "Ljava/awt/Frame;"
   )
   public static Frame field1098;

   @OriginalMember(
      owner = "client!aka",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method828(byte arg0) {
      try {
         if (arg0 > 51) {
            field1100 = null;
            field1098 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field1107[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aka",
      name = "a",
      descriptor = "(ILui;)Z"
   )
   public final boolean method829(int arg0, class241 arg1) {
      try {
         if (arg0 != 22876) {
            return true;
         } else {
            ++field1097;
            int var3 = this.method831(-20699);
            arg1.method3943(-4);
            --this.field1099;
            if (this.field1099 == 0) {
               this.method3609(87);
               this.method3943(-4);
               --class432.field6026;
               class501.field6886.method4238(77, this, arg1.field3003);
               return false;
            } else {
               return ~var3 != ~this.method831(-20699);
            }
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field1107[2] + arg0 + ',' + (arg1 != null ? field1107[4] : field1107[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aka",
      name = "a",
      descriptor = "(JI)Ljava/lang/String;"
   )
   public static final String method830(long arg0, int arg1) {
      boolean var3 = client.field4273;

      try {
         ++field1102;
         if (arg0 > 0L && ~arg0 > -6582952005840035282L) {
            if (arg0 % 37L == 0L) {
               return null;
            } else {
               int var4 = 0;
               long var5 = arg0;
               if (var3) {
                  var5 = arg0 / 37L;
                  ++var4;
               }

               while(true) {
                  while(~var5 != -1L) {
                     var5 /= 37L;
                     ++var4;
                  }

                  if (!var3) {
                     if (arg1 != -29301) {
                        return null;
                     }

                     StringBuffer var7 = new StringBuffer(var4);
                     if (!var3 && ~arg0 == -1L) {
                        var7.reverse();
                        var7.setCharAt(0, Character.toUpperCase(var7.charAt(0)));
                        return var7.toString();
                     }

                     do {
                        long var8 = arg0;
                        arg0 /= 37L;
                        char var10 = class657.field9333[(int)(-(arg0 * 37L) + var8)];
                        if (var10 == '_') {
                           int var11 = -1 + var7.length();
                           var10 = 160;
                           var7.setCharAt(var11, Character.toUpperCase(var7.charAt(var11)));
                        }

                        var7.append(var10);
                     } while(~arg0 != -1L);

                     var7.reverse();
                     var7.setCharAt(0, Character.toUpperCase(var7.charAt(0)));
                     return var7.toString();
                  }

                  ++var4;
               }
            }
         } else {
            return null;
         }
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field1107[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aka",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method831(int arg0) {
      try {
         ++field1104;
         if (this.field1105.field7496.field7453 != this.field1105.field7496) {
            return ((class241)this.field1105.field7496.field7453).field2993;
         } else {
            if (arg0 != -20699) {
               this.method833(-114, (class241)null);
            }

            return -1;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1107[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aka",
      name = "a",
      descriptor = "(ZB)V"
   )
   public static final void method832(boolean arg0, byte arg1) {
      try {
         ++field1103;
         if (class444.field6156 == null) {
            class510.method3703((byte)79);
         }

         if (arg0) {
            class444.field6156.method5580((byte)-41);
         }

         if (arg1 != -67) {
            field1100 = null;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1107[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aka",
      name = "b",
      descriptor = "(ILui;)Z"
   )
   public final boolean method833(int arg0, class241 arg1) {
      boolean var3 = client.field4273;

      try {
         ++field1106;
         arg1.method3943(-4);
         if (arg0 != 4197) {
            return false;
         } else {
            boolean var4 = true;
            class241 var5 = (class241)this.field1105.method3964((byte)126);
            boolean var10000;
            if (var3) {
               var10000 = class270.method2065(var5.field2993, arg1.field2993, (byte)115);
            } else if (var5 == null) {
               this.field1105.method3968(arg1, (byte)-1);
               ++this.field1099;
               var10000 = var4;
               if (!var3) {
                  return var4;
               }
            } else {
               var10000 = class270.method2065(var5.field2993, arg1.field2993, (byte)115);
            }

            while(!var10000) {
               var5 = (class241)this.field1105.method3965(true);
               var4 = false;
               if (var5 == null) {
                  this.field1105.method3968(arg1, (byte)-1);
                  ++this.field1099;
                  var10000 = var4;
                  if (!var3) {
                     return var4;
                  }
               } else {
                  var10000 = class270.method2065(var5.field2993, arg1.field2993, (byte)115);
               }
            }

            class518.method3756(arg1, var5, 1);
            ++this.field1099;
            if (var4) {
               return false;
            } else {
               return true;
            }
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field1107[6] + arg0 + ',' + (arg1 != null ? field1107[4] : field1107[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aka",
      name = "<init>",
      descriptor = "(Ljava/lang/String;)V"
   )
   public class85(String arg0) {
      try {
         this.field1101 = arg0;
         this.field1105 = new class549();
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1107[5] + (arg0 != null ? field1107[4] : field1107[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method834(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 82);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method835(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 82;
            break;
         case 1:
            var10005 = 8;
            break;
         case 2:
            var10005 = 2;
            break;
         case 3:
            var10005 = 106;
            break;
         default:
            var10005 = 82;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
