import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bia")
public class class16 {
   @OriginalMember(
      owner = "client!bia",
      name = "i",
      descriptor = "Lcda;"
   )
   public class444 field216 = new class444();
   @OriginalMember(
      owner = "client!bia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field221 = new String[]{method129(method128("F3PZ\u007f\f")), method129(method128("F3PZ}\f")), method129(method128("F3PZ\u0006M4X\u0000\u0004\f")), method129(method128("J/]\u0018")), method129(method128("_t\u001fZG")), method129(method128("F3PZ~\f")), method129(method128("F3PZ{\f")), method129(method128("F3PZ|\f")), method129(method128("F3PZr\f")), method129(method128("F3PZx\f")), method129(method128("F3PZy\f"))};
   @OriginalMember(
      owner = "client!bia",
      name = "e",
      descriptor = "I"
   )
   public static int field213 = 0;
   @OriginalMember(
      owner = "client!bia",
      name = "b",
      descriptor = "I"
   )
   public static int field210;
   @OriginalMember(
      owner = "client!bia",
      name = "f",
      descriptor = "I"
   )
   public static int field211;
   @OriginalMember(
      owner = "client!bia",
      name = "g",
      descriptor = "I"
   )
   public static int field212;
   @OriginalMember(
      owner = "client!bia",
      name = "k",
      descriptor = "I"
   )
   public static int field215;
   @OriginalMember(
      owner = "client!bia",
      name = "c",
      descriptor = "I"
   )
   public static int field217;
   @OriginalMember(
      owner = "client!bia",
      name = "a",
      descriptor = "I"
   )
   public static int field219;
   @OriginalMember(
      owner = "client!bia",
      name = "d",
      descriptor = "I"
   )
   public static int field220;
   @OriginalMember(
      owner = "client!bia",
      name = "h",
      descriptor = "Lcda;"
   )
   private class444 field218;
   @OriginalMember(
      owner = "client!bia",
      name = "j",
      descriptor = "Lgj;"
   )
   public static class761 field214;

   @OriginalMember(
      owner = "client!bia",
      name = "e",
      descriptor = "(I)Lcda;",
      line = 8
   )
   public final class444 method120(int arg0) {
      try {
         if (arg0 < 103) {
            return null;
         } else {
            ++field212;
            class444 var2 = this.field216.field6814;
            if (this.field216 == var2) {
               this.field218 = null;
               return null;
            } else {
               this.field218 = var2.field6814;
               return var2;
            }
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field221[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bia",
      name = "c",
      descriptor = "(I)V",
      line = 31
   )
   public static void method121(int arg0) {
      try {
         field214 = null;
         if (arg0 != 12320) {
            field213 = 43;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field221[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bia",
      name = "d",
      descriptor = "(I)V",
      line = 46
   )
   public final void method122(int arg0) {
      boolean var2 = client.field1786;

      try {
         ++field219;

         while(true) {
            class444 var3 = this.field216.field6814;
            if (this.field216 != var3) {
               var3.method3491(127);
               if (var2) {
                  break;
               }

               if (!var2) {
                  continue;
               }
            }

            this.field218 = null;
            break;
         }

         if (arg0 != -8107) {
            field213 = 44;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field221[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bia",
      name = "a",
      descriptor = "(Lcda;I)V",
      line = 69
   )
   public final void method123(class444 arg0, int arg1) {
      try {
         ++field215;
         if (arg0.field6809 != null) {
            arg0.method3491(-127);
         }

         arg0.field6809 = this.field216.field6809;
         arg0.field6814 = this.field216;
         arg0.field6809.field6814 = arg0;
         if (arg1 < -32) {
            arg0.field6814.field6809 = arg0;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field221[5] + (arg0 != null ? field221[4] : field221[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bia",
      name = "a",
      descriptor = "(BLjava/lang/String;Ljava/lang/String;I)V",
      line = 88
   )
   public static final void method124(byte arg0, String arg1, String arg2, int arg3) {
      try {
         ++field211;
         if (~arg1.length() >= -321) {
            if (class225.method1954(-108)) {
               if (arg0 < -7) {
                  class144.method1303((byte)83);
                  class444.field6812 = arg3;
                  class722.field10813 = arg1;
                  class455.field6963 = arg2;
                  class69.method532(1, 6);
               }
            }
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field221[7] + arg0 + ',' + (arg1 != null ? field221[4] : field221[3]) + ',' + (arg2 != null ? field221[4] : field221[3]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bia",
      name = "a",
      descriptor = "(I)Lcda;",
      line = 112
   )
   public final class444 method125(int arg0) {
      try {
         if (arg0 != 0) {
            this.field216 = null;
         }

         ++field217;
         class444 var2 = this.field218;
         if (this.field216 == var2) {
            this.field218 = null;
            return null;
         } else {
            this.field218 = var2.field6814;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field221[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bia",
      name = "a",
      descriptor = "(ILuaa;)V",
      line = 134
   )
   public static final void method126(int arg0, class119 arg1) {
      try {
         if (arg0 < -84) {
            label42: {
               if (arg1 instanceof class466) {
                  class466 var2 = (class466)arg1;
                  if (var2.field7072 == null) {
                     break label42;
                  }

                  class629.method4609(2, ~class476.field7251.field1506 != ~var2.field1506, var2);
                  if (!client.field1786) {
                     break label42;
                  }
               }

               if (arg1 instanceof class9) {
                  class9 var3 = (class9)arg1;
                  class123.method1138(class476.field7251.field1506 != var3.field1506, -1, var3);
               }
            }

            ++field210;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field221[10] + arg0 + ',' + (arg1 != null ? field221[4] : field221[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bia",
      name = "<init>",
      descriptor = "()V",
      line = 190
   )
   public class16() {
      try {
         this.field216.field6814 = this.field216;
         this.field216.field6809 = this.field216;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field221[2] + ')');
      }
   }

   @OriginalMember(
      owner = "client!bia",
      name = "b",
      descriptor = "(I)I",
      line = 166
   )
   public final int method127(int arg0) {
      boolean var2 = client.field1786;

      try {
         ++field220;
         int var3 = arg0;
         class444 var4 = this.field216.field6814;
         if (var2) {
            var3 = arg0 + 1;
            var4 = var4.field6814;
         }

         while(true) {
            if (this.field216 == var4) {
               if (!var2) {
                  return var3;
               }
            } else {
               ++var3;
            }

            var4 = var4.field6814;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field221[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method128(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 58);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method129(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 36;
            break;
         case 1:
            var10005 = 90;
            break;
         case 2:
            var10005 = 49;
            break;
         case 3:
            var10005 = 116;
            break;
         default:
            var10005 = 58;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
