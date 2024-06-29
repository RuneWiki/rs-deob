import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class244 {
   @OriginalMember(
      owner = "client!hr",
      name = "q",
      descriptor = "F"
   )
   public float field3082;
   @OriginalMember(
      owner = "client!hr",
      name = "g",
      descriptor = "F"
   )
   public float field3090;
   @OriginalMember(
      owner = "client!hr",
      name = "a",
      descriptor = "F"
   )
   public float field3085;
   @OriginalMember(
      owner = "client!hr",
      name = "o",
      descriptor = "Lkc;"
   )
   public class72 field3078;
   @OriginalMember(
      owner = "client!hr",
      name = "h",
      descriptor = "I"
   )
   public int field3081;
   @OriginalMember(
      owner = "client!hr",
      name = "r",
      descriptor = "I"
   )
   public int field3086;
   @OriginalMember(
      owner = "client!hr",
      name = "i",
      descriptor = "I"
   )
   public int field3077;
   @OriginalMember(
      owner = "client!hr",
      name = "l",
      descriptor = "I"
   )
   public int field3075;
   @OriginalMember(
      owner = "client!hr",
      name = "n",
      descriptor = "F"
   )
   public float field3089;
   @OriginalMember(
      owner = "client!hr",
      name = "b",
      descriptor = "I"
   )
   public int field3084;
   @OriginalMember(
      owner = "client!hr",
      name = "f",
      descriptor = "I"
   )
   public int field3088;
   @OriginalMember(
      owner = "client!hr",
      name = "m",
      descriptor = "F"
   )
   public float field3076;
   @OriginalMember(
      owner = "client!hr",
      name = "p",
      descriptor = "F"
   )
   public float field3074;
   @OriginalMember(
      owner = "client!hr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3091 = new String[]{method1942(method1941("\u001b5Twz")), method1942(method1941("\u000en\u00165")), method1942(method1941("\biT\u001c/")), method1942(method1941("\biT\u001a/")), method1942(method1941("\biT\u001d/")), method1942(method1941("\biT\u0018/")), method1942(method1941("\biTen\u000er\u000eg/")), method1942(method1941("\biT\u001b/"))};
   @OriginalMember(
      owner = "client!hr",
      name = "j",
      descriptor = "[Lfha;"
   )
   public static class289[] field3083 = new class289[16];
   @OriginalMember(
      owner = "client!hr",
      name = "k",
      descriptor = "I"
   )
   public static int field3073;
   @OriginalMember(
      owner = "client!hr",
      name = "e",
      descriptor = "I"
   )
   public static int field3079;
   @OriginalMember(
      owner = "client!hr",
      name = "c",
      descriptor = "I"
   )
   public static int field3080;
   @OriginalMember(
      owner = "client!hr",
      name = "d",
      descriptor = "I"
   )
   public static int field3087;

   @OriginalMember(
      owner = "client!hr",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method1936(int arg0) {
      try {
         if (class199.field2533 != null) {
            try {
               class199.field2533.close();
            } catch (IOException var2) {
            }
         }

         if (arg0 != -8286) {
            field3083 = null;
         }

         ++field3087;
         class199.field2533 = null;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3091[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hr",
      name = "a",
      descriptor = "(Lhr;I)Z"
   )
   public final boolean method1937(class244 arg0, int arg1) {
      try {
         if (arg1 != 0) {
            this.method1938((class66)null, -42);
         }

         ++field3080;
         return this.field3077 == arg0.field3077 && this.field3089 == arg0.field3089 && this.field3074 == arg0.field3074 && this.field3076 == arg0.field3076 && this.field3082 == arg0.field3082 && this.field3090 == arg0.field3090 && this.field3085 == arg0.field3085 && this.field3075 == arg0.field3075 && this.field3084 == arg0.field3084 && this.field3078 == arg0.field3078;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3091[2] + (arg0 != null ? field3091[0] : field3091[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hr",
      name = "a",
      descriptor = "(Lgea;I)V"
   )
   public final void method1938(class66 arg0, int arg1) {
      try {
         ++field3079;
         this.field3090 = (float)(arg0.method640(255) * 8) / 255.0F;
         this.field3082 = (float)(8 * arg0.method640(255)) / 255.0F;
         this.field3085 = (float)(arg0.method640(255) * arg1) / 255.0F;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3091[5] + (arg0 != null ? field3091[0] : field3091[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hr",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method1939(int arg0, int arg1, int arg2) {
      try {
         if (arg0 != 0) {
            method1936(29);
         }

         ++field3073;
         return (55 & arg1) != 0;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3091[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hr",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1940(byte arg0) {
      try {
         field3083 = null;
         if (arg0 != 34) {
            field3083 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3091[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hr",
      name = "<init>",
      descriptor = "()V"
   )
   public class244() {
      this.field3082 = 0.25F;
      this.field3090 = 1.0F;
      this.field3085 = 1.0F;

      try {
         this.field3078 = class199.field2536;
         this.field3081 = -50;
         this.field3086 = -50;
         this.field3077 = class591.field8716;
         this.field3075 = class477.field6648;
         this.field3089 = 1.1523438F;
         this.field3084 = 0;
         this.field3088 = -60;
         this.field3076 = 1.2F;
         this.field3074 = 0.69921875F;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3091[6] + ')');
      }
   }

   @OriginalMember(
      owner = "client!hr",
      name = "<init>",
      descriptor = "(Lgea;)V"
   )
   public class244(class66 arg0) {
      boolean var2 = client.field1481;
      super();
      this.field3082 = 0.25F;
      this.field3090 = 1.0F;
      this.field3085 = 1.0F;

      try {
         int var3;
         label114: {
            var3 = arg0.method640(255);
            if (~class757.field11093.field11016.method1496(-18033) == -2 && ~class577.field8555.method487() < -1) {
               label105: {
                  if ((var3 & 1) == 0) {
                     this.field3077 = class591.field8716;
                     if (!var2) {
                        break label105;
                     }
                  }

                  this.field3077 = arg0.method610(-63);
               }

               label100: {
                  if ((var3 & 2) == 0) {
                     this.field3089 = 1.1523438F;
                     if (!var2) {
                        break label100;
                     }
                  }

                  this.field3089 = (float)arg0.method603(-2) / 256.0F;
               }

               label95: {
                  if ((4 & var3) == 0) {
                     this.field3074 = 0.69921875F;
                     if (!var2) {
                        break label95;
                     }
                  }

                  this.field3074 = (float)arg0.method603(-2) / 256.0F;
               }

               if (~(8 & var3) != -1) {
                  this.field3076 = (float)arg0.method603(-2) / 256.0F;
                  if (!var2) {
                     break label114;
                  }
               }

               this.field3076 = 1.2F;
               if (!var2) {
                  break label114;
               }
            }

            if ((1 & var3) != 0) {
               arg0.method610(-76);
            }

            if ((var3 & 2) != 0) {
               arg0.method603(-2);
            }

            if ((4 & var3) != 0) {
               arg0.method603(-2);
            }

            if ((8 & var3) != 0) {
               arg0.method603(-2);
            }

            this.field3089 = 1.1523438F;
            this.field3077 = class591.field8716;
            this.field3074 = 0.69921875F;
            this.field3076 = 1.2F;
         }

         label85: {
            if ((16 & var3) != 0) {
               this.field3081 = arg0.method652((byte)124);
               this.field3088 = arg0.method652((byte)-91);
               this.field3086 = arg0.method652((byte)85);
               if (!var2) {
                  break label85;
               }
            }

            this.field3081 = -50;
            this.field3088 = -60;
            this.field3086 = -50;
         }

         label80: {
            if ((32 & var3) != 0) {
               this.field3075 = arg0.method610(-81);
               if (!var2) {
                  break label80;
               }
            }

            this.field3075 = class477.field6648;
         }

         label75: {
            if ((64 & var3) != 0) {
               this.field3084 = arg0.method603(-2);
               if (!var2) {
                  break label75;
               }
            }

            this.field3084 = 0;
         }

         if (~(var3 & 128) == -1) {
            this.field3078 = class199.field2536;
         } else {
            int var4 = arg0.method603(-2);
            int var5 = arg0.method603(-2);
            int var6 = arg0.method603(-2);
            int var7 = arg0.method603(-2);
            int var8 = arg0.method603(-2);
            int var9 = arg0.method603(-2);
            this.field3078 = class613.method4517(var6, var5, var9, -4, var7, var4, var8);
         }
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field3091[6] + (arg0 != null ? field3091[0] : field3091[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1941(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 7);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1942(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 96;
            break;
         case 1:
            var10005 = 27;
            break;
         case 2:
            var10005 = 122;
            break;
         case 3:
            var10005 = 89;
            break;
         default:
            var10005 = 7;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
