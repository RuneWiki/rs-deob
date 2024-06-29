import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class337 {
   @OriginalMember(
      owner = "client!vc",
      name = "i",
      descriptor = "[I"
   )
   private int[] field4585 = new int[]{-1, -1, -1, -1, -1};
   @OriginalMember(
      owner = "client!vc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4595 = new String[]{method2488(method2487("N\u001aO\u007fm")), method2488(method2487("V\f\rV")), method2488(method2487("N\u001aO~m")), method2488(method2487("CWO\u00148")), method2488(method2487("N\u001aO|m")), method2488(method2487("N\u001aO{m")), method2488(method2487("N\u001aOym")), method2488(method2487("N\u001aOxm"))};
   @OriginalMember(
      owner = "client!vc",
      name = "k",
      descriptor = "I"
   )
   public static int field4594 = 104;
   @OriginalMember(
      owner = "client!vc",
      name = "f",
      descriptor = "F"
   )
   public static float field4586;
   @OriginalMember(
      owner = "client!vc",
      name = "n",
      descriptor = "I"
   )
   public static int field4580;
   @OriginalMember(
      owner = "client!vc",
      name = "o",
      descriptor = "I"
   )
   public static int field4587;
   @OriginalMember(
      owner = "client!vc",
      name = "c",
      descriptor = "I"
   )
   public static int field4588;
   @OriginalMember(
      owner = "client!vc",
      name = "g",
      descriptor = "I"
   )
   public static int field4589;
   @OriginalMember(
      owner = "client!vc",
      name = "h",
      descriptor = "I"
   )
   public static int field4591;
   @OriginalMember(
      owner = "client!vc",
      name = "b",
      descriptor = "I"
   )
   public static int field4593;
   @OriginalMember(
      owner = "client!vc",
      name = "j",
      descriptor = "Ldi;"
   )
   public class138 field4583;
   @OriginalMember(
      owner = "client!vc",
      name = "a",
      descriptor = "[I"
   )
   private int[] field4582;
   @OriginalMember(
      owner = "client!vc",
      name = "m",
      descriptor = "[S"
   )
   private short[] field4581;
   @OriginalMember(
      owner = "client!vc",
      name = "d",
      descriptor = "[S"
   )
   private short[] field4584;
   @OriginalMember(
      owner = "client!vc",
      name = "l",
      descriptor = "[S"
   )
   private short[] field4590;
   @OriginalMember(
      owner = "client!vc",
      name = "e",
      descriptor = "[S"
   )
   private short[] field4592;

   @OriginalMember(
      owner = "client!vc",
      name = "a",
      descriptor = "(BILwf;)V",
      line = 9
   )
   private final void method2481(byte arg0, int arg1, class147 arg2) {
      boolean var4 = client.field4360;

      try {
         label131: {
            if (arg1 == 1) {
               arg2.method1143(-15465);
               if (!var4) {
                  break label131;
               }
            }

            if (~arg1 != -3) {
               if (~arg1 == -4) {
                  break label131;
               }

               if (arg1 != 40) {
                  if (~arg1 == -42) {
                     int var5 = arg2.method1143(-15465);
                     this.field4592 = new short[var5];
                     this.field4581 = new short[var5];
                     int var6 = 0;
                     if (var4) {
                        this.field4581[var6] = (short)arg2.method1211(-26166);
                        this.field4592[var6] = (short)arg2.method1211(-26166);
                        ++var6;
                     }

                     while(true) {
                        while(~var5 < ~var6) {
                           this.field4581[var6] = (short)arg2.method1211(-26166);
                           this.field4592[var6] = (short)arg2.method1211(-26166);
                           ++var6;
                        }

                        if (!var4) {
                           if (!var4) {
                              break label131;
                           }
                           break;
                        }

                        ++var6;
                     }
                  }

                  if (~arg1 > -61 || ~arg1 <= -71) {
                     break label131;
                  }

                  this.field4585[arg1 + -60] = arg2.method1211(-26166);
                  if (!var4) {
                     break label131;
                  }
               }

               int var7 = arg2.method1143(-15465);
               this.field4590 = new short[var7];
               this.field4584 = new short[var7];
               int var8 = 0;
               if (var4) {
                  this.field4590[var8] = (short)arg2.method1211(-26166);
                  this.field4584[var8] = (short)arg2.method1211(-26166);
                  ++var8;
               }

               while(true) {
                  while(var8 < var7) {
                     this.field4590[var8] = (short)arg2.method1211(-26166);
                     this.field4584[var8] = (short)arg2.method1211(-26166);
                     ++var8;
                  }

                  if (!var4) {
                     if (!var4) {
                        break label131;
                     }
                     break;
                  }

                  ++var8;
               }
            }

            int var9 = arg2.method1143(-15465);
            this.field4582 = new int[var9];
            int var10 = 0;
            if (var4 || var9 > var10) {
               do {
                  this.field4582[var10] = arg2.method1211(-26166);
                  ++var10;
               } while(var9 > var10);
            }
         }

         ++field4587;
         if (arg0 <= 108) {
            this.method2484(-30);
         }
      } catch (RuntimeException var12) {
         throw class237.method1823(var12, field4595[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4595[3] : field4595[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vc",
      name = "a",
      descriptor = "(B)Lio;",
      line = 89
   )
   public final class464 method2482(byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!vc",
      name = "b",
      descriptor = "(B)Z",
      line = 179
   )
   public final boolean method2483(byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!vc",
      name = "a",
      descriptor = "(I)Lio;",
      line = 208
   )
   public final class464 method2484(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!vc",
      name = "c",
      descriptor = "(B)Z",
      line = 277
   )
   public final boolean method2485(byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!vc",
      name = "a",
      descriptor = "(BLwf;)V",
      line = 305
   )
   public final void method2486(byte arg0, class147 arg1) {
      boolean var3 = client.field4360;

      try {
         while(true) {
            int var4 = arg1.method1143(-15465);
            if (var4 != 0) {
               this.method2481((byte)113, var4, arg1);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            if (arg0 <= 80) {
               this.method2482((byte)-79);
            }

            ++field4593;
            break;
         }

      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field4595[6] + arg0 + ',' + (arg1 != null ? field4595[3] : field4595[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2487(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 69);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2488(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 56;
            break;
         case 1:
            var10005 = 121;
            break;
         case 2:
            var10005 = 97;
            break;
         case 3:
            var10005 = 58;
            break;
         default:
            var10005 = 69;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
