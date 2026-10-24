package deob;

@ObfuscatedName("AOKWRKNA")
public class AOKWRKNA {

	@ObfuscatedName("AOKWRKNA.c")
	public int field1 = 0;

	@ObfuscatedName("AOKWRKNA.d")
	public int field2 = 0;

	@ObfuscatedName("AOKWRKNA.e")
	public int field3;

	@ObfuscatedName("AOKWRKNA.f")
	public int field4;

	@ObfuscatedName("AOKWRKNA.g")
	public int[][] field5;

	public AOKWRKNA(int arg0, int arg1) {
		field3 = arg0;
		field4 = arg1;
		field5 = new int[field3][field4];
		method1();
	}

	@ObfuscatedName("AOKWRKNA.a()V")
	public void method1() {
		for (int var1 = 0; var1 < field3; var1++) {
			for (int var2 = 0; var2 < field4; var2++) {
				if (var1 == 0 || var2 == 0 || field3 - 1 == var1 || field4 - 1 == var2) {
					field5[var1][var2] = 0xFFFFFF;
				} else {
					field5[var1][var2] = 0x1000000;
				}
			}
		}
	}

	@ObfuscatedName("AOKWRKNA.a(BIIZII)V")
	public void method2(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
		arg1 -= field1;
		arg0 -= field2;
		if (arg4 == 0) {
			if (arg3 == 0) {
				method5(arg1, arg0, 128);
				method5(arg1 - 1, arg0, 8);
			}

			if (arg3 == 1) {
				method5(arg1, arg0, 2);
				method5(arg1, arg0 + 1, 32);
			}

			if (arg3 == 2) {
				method5(arg1, arg0, 8);
				method5(arg1 + 1, arg0, 128);
			}

			if (arg3 == 3) {
				method5(arg1, arg0, 32);
				method5(arg1, arg0 - 1, 2);
			}
		}

		if (arg4 == 1 || arg4 == 3) {
			if (arg3 == 0) {
				method5(arg1, arg0, 1);
				method5(arg1 - 1, arg0 + 1, 16);
			}

			if (arg3 == 1) {
				method5(arg1, arg0, 4);
				method5(arg1 + 1, arg0 + 1, 64);
			}

			if (arg3 == 2) {
				method5(arg1, arg0, 16);
				method5(arg1 + 1, arg0 - 1, 1);
			}

			if (arg3 == 3) {
				method5(arg1, arg0, 64);
				method5(arg1 - 1, arg0 - 1, 4);
			}
		}

		if (arg4 == 2) {
			if (arg3 == 0) {
				method5(arg1, arg0, 130);
				method5(arg1 - 1, arg0, 8);
				method5(arg1, arg0 + 1, 32);
			}

			if (arg3 == 1) {
				method5(arg1, arg0, 10);
				method5(arg1, arg0 + 1, 32);
				method5(arg1 + 1, arg0, 128);
			}

			if (arg3 == 2) {
				method5(arg1, arg0, 40);
				method5(arg1 + 1, arg0, 128);
				method5(arg1, arg0 - 1, 2);
			}

			if (arg3 == 3) {
				method5(arg1, arg0, 160);
				method5(arg1, arg0 - 1, 2);
				method5(arg1 - 1, arg0, 8);
			}
		}

		if (arg2) {
			if (arg4 == 0) {
				if (arg3 == 0) {
					method5(arg1, arg0, 0x10000);
					method5(arg1 - 1, arg0, 4096);
				}

				if (arg3 == 1) {
					method5(arg1, arg0, 1024);
					method5(arg1, arg0 + 1, 16384);
				}

				if (arg3 == 2) {
					method5(arg1, arg0, 4096);
					method5(arg1 + 1, arg0, 0x10000);
				}

				if (arg3 == 3) {
					method5(arg1, arg0, 16384);
					method5(arg1, arg0 - 1, 1024);
				}
			}

			if (arg4 == 1 || arg4 == 3) {
				if (arg3 == 0) {
					method5(arg1, arg0, 512);
					method5(arg1 - 1, arg0 + 1, 8192);
				}

				if (arg3 == 1) {
					method5(arg1, arg0, 2048);
					method5(arg1 + 1, arg0 + 1, 32768);
				}

				if (arg3 == 2) {
					method5(arg1, arg0, 8192);
					method5(arg1 + 1, arg0 - 1, 512);
				}

				if (arg3 == 3) {
					method5(arg1, arg0, 32768);
					method5(arg1 - 1, arg0 - 1, 2048);
				}
			}

			if (arg4 == 2) {
				if (arg3 == 0) {
					method5(arg1, arg0, 66560);
					method5(arg1 - 1, arg0, 4096);
					method5(arg1, arg0 + 1, 16384);
				}

				if (arg3 == 1) {
					method5(arg1, arg0, 5120);
					method5(arg1, arg0 + 1, 16384);
					method5(arg1 + 1, arg0, 0x10000);
				}

				if (arg3 == 2) {
					method5(arg1, arg0, 20480);
					method5(arg1 + 1, arg0, 0x10000);
					method5(arg1, arg0 - 1, 1024);
				}

				if (arg3 == 3) {
					method5(arg1, arg0, 81920);
					method5(arg1, arg0 - 1, 1024);
					method5(arg1 - 1, arg0, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("AOKWRKNA.a(IIIIZII)V")
	public void method3(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
		int var7 = 256;
		if (arg4) {
			var7 += 0x20000;
		}

		arg3 -= field1;
		arg1 -= field2;

		if (arg2 == 1 || arg2 == 3) {
			int var8 = arg0;
			arg0 = arg5;
			arg5 = var8;
		}

		for (int var9 = arg3; var9 < arg0 + arg3; var9++) {
			if (var9 >= 0 && var9 < field3) {
				for (int var10 = arg1; var10 < arg1 + arg5; var10++) {
					if (var10 >= 0 && var10 < field4) {
						method5(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("AOKWRKNA.a(III)V")
	public void method4(int arg0, int arg1) {
		arg1 -= field1;
		arg0 -= field2;
		field5[arg1][arg0] |= 0x200000;
	}

	@ObfuscatedName("AOKWRKNA.b(III)V")
	public void method5(int arg0, int arg1, int arg2) {
		field5[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("AOKWRKNA.a(IZIIII)V")
	public void method6(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
		arg3 -= field1;
		arg4 -= field2;
		if (arg0 == 0) {
			if (arg2 == 0) {
				method8(arg4, arg3, 128);
				method8(arg4, arg3 - 1, 8);
			}

			if (arg2 == 1) {
				method8(arg4, arg3, 2);
				method8(arg4 + 1, arg3, 32);
			}

			if (arg2 == 2) {
				method8(arg4, arg3, 8);
				method8(arg4, arg3 + 1, 128);
			}

			if (arg2 == 3) {
				method8(arg4, arg3, 32);
				method8(arg4 - 1, arg3, 2);
			}
		}

		if (arg0 == 1 || arg0 == 3) {
			if (arg2 == 0) {
				method8(arg4, arg3, 1);
				method8(arg4 + 1, arg3 - 1, 16);
			}

			if (arg2 == 1) {
				method8(arg4, arg3, 4);
				method8(arg4 + 1, arg3 + 1, 64);
			}

			if (arg2 == 2) {
				method8(arg4, arg3, 16);
				method8(arg4 - 1, arg3 + 1, 1);
			}

			if (arg2 == 3) {
				method8(arg4, arg3, 64);
				method8(arg4 - 1, arg3 - 1, 4);
			}
		}

		if (arg0 == 2) {
			if (arg2 == 0) {
				method8(arg4, arg3, 130);
				method8(arg4, arg3 - 1, 8);
				method8(arg4 + 1, arg3, 32);
			}

			if (arg2 == 1) {
				method8(arg4, arg3, 10);
				method8(arg4 + 1, arg3, 32);
				method8(arg4, arg3 + 1, 128);
			}

			if (arg2 == 2) {
				method8(arg4, arg3, 40);
				method8(arg4, arg3 + 1, 128);
				method8(arg4 - 1, arg3, 2);
			}

			if (arg2 == 3) {
				method8(arg4, arg3, 160);
				method8(arg4 - 1, arg3, 2);
				method8(arg4, arg3 - 1, 8);
			}
		}

		if (arg1) {
			if (arg0 == 0) {
				if (arg2 == 0) {
					method8(arg4, arg3, 0x10000);
					method8(arg4, arg3 - 1, 4096);
				}

				if (arg2 == 1) {
					method8(arg4, arg3, 1024);
					method8(arg4 + 1, arg3, 16384);
				}

				if (arg2 == 2) {
					method8(arg4, arg3, 4096);
					method8(arg4, arg3 + 1, 0x10000);
				}

				if (arg2 == 3) {
					method8(arg4, arg3, 16384);
					method8(arg4 - 1, arg3, 1024);
				}
			}

			if (arg0 == 1 || arg0 == 3) {
				if (arg2 == 0) {
					method8(arg4, arg3, 512);
					method8(arg4 + 1, arg3 - 1, 8192);
				}

				if (arg2 == 1) {
					method8(arg4, arg3, 2048);
					method8(arg4 + 1, arg3 + 1, 32768);
				}

				if (arg2 == 2) {
					method8(arg4, arg3, 8192);
					method8(arg4 - 1, arg3 + 1, 512);
				}

				if (arg2 == 3) {
					method8(arg4, arg3, 32768);
					method8(arg4 - 1, arg3 - 1, 2048);
				}
			}

			if (arg0 == 2) {
				if (arg2 == 0) {
					method8(arg4, arg3, 66560);
					method8(arg4, arg3 - 1, 4096);
					method8(arg4 + 1, arg3, 16384);
				}

				if (arg2 == 1) {
					method8(arg4, arg3, 5120);
					method8(arg4 + 1, arg3, 16384);
					method8(arg4, arg3 + 1, 0x10000);
				}

				if (arg2 == 2) {
					method8(arg4, arg3, 20480);
					method8(arg4, arg3 + 1, 0x10000);
					method8(arg4 - 1, arg3, 1024);
				}

				if (arg2 == 3) {
					method8(arg4, arg3, 81920);
					method8(arg4 - 1, arg3, 1024);
					method8(arg4, arg3 - 1, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("AOKWRKNA.a(ZIIIIII)V")
	public void method7(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg0) {
			var7 += 0x20000;
		}

		arg2 -= field1;
		arg3 -= field2;

		if (arg4 == 1 || arg4 == 3) {
			int var8 = arg5;
			arg5 = arg1;
			arg1 = var8;
		}

		for (int var9 = arg2; var9 < arg2 + arg5; var9++) {
			if (var9 >= 0 && var9 < field3) {
				for (int var10 = arg3; var10 < arg1 + arg3; var10++) {
					if (var10 >= 0 && var10 < field4) {
						method8(var10, var9, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("AOKWRKNA.a(IIII)V")
	public void method8(int arg0, int arg1, int arg2) {
		field5[arg1][arg0] &= 0xFFFFFF - arg2;
	}

	@ObfuscatedName("AOKWRKNA.a(BII)V")
	public void method9(int arg0, int arg1) {
		arg0 -= field1;
		arg1 -= field2;
		field5[arg0][arg1] &= 0xDFFFFF;
	}

	@ObfuscatedName("AOKWRKNA.a(IIIIIII)Z")
	public boolean method10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg4 == arg5 && arg0 == arg1) {
			return true;
		}

		arg4 -= field1;
		arg0 -= field2;
		arg5 -= field1;
		arg1 -= field2;
		if (arg3 == 0) {
			if (arg2 == 0) {
				if (arg5 - 1 == arg4 && arg0 == arg1) {
					return true;
				}

				if (arg4 == arg5 && arg1 + 1 == arg0 && (field5[arg4][arg0] & 0x1280120) == 0) {
					return true;
				}

				if (arg4 == arg5 && arg1 - 1 == arg0 && (field5[arg4][arg0] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (arg4 == arg5 && arg1 + 1 == arg0) {
					return true;
				}

				if (arg5 - 1 == arg4 && arg0 == arg1 && (field5[arg4][arg0] & 0x1280108) == 0) {
					return true;
				}

				if (arg5 + 1 == arg4 && arg0 == arg1 && (field5[arg4][arg0] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (arg5 + 1 == arg4 && arg0 == arg1) {
					return true;
				}

				if (arg4 == arg5 && arg1 + 1 == arg0 && (field5[arg4][arg0] & 0x1280120) == 0) {
					return true;
				}

				if (arg4 == arg5 && arg1 - 1 == arg0 && (field5[arg4][arg0] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg2 == 3) {
				if (arg4 == arg5 && arg1 - 1 == arg0) {
					return true;
				}

				if (arg5 - 1 == arg4 && arg0 == arg1 && (field5[arg4][arg0] & 0x1280108) == 0) {
					return true;
				}

				if (arg5 + 1 == arg4 && arg0 == arg1 && (field5[arg4][arg0] & 0x1280180) == 0) {
					return true;
				}
			}
		}

		if (arg3 == 2) {
			if (arg2 == 0) {
				if (arg5 - 1 == arg4 && arg0 == arg1) {
					return true;
				}

				if (arg4 == arg5 && arg1 + 1 == arg0) {
					return true;
				}

				if (arg5 + 1 == arg4 && arg0 == arg1 && (field5[arg4][arg0] & 0x1280180) == 0) {
					return true;
				}

				if (arg4 == arg5 && arg1 - 1 == arg0 && (field5[arg4][arg0] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (arg5 - 1 == arg4 && arg0 == arg1 && (field5[arg4][arg0] & 0x1280108) == 0) {
					return true;
				}

				if (arg4 == arg5 && arg1 + 1 == arg0) {
					return true;
				}

				if (arg5 + 1 == arg4 && arg0 == arg1) {
					return true;
				}

				if (arg4 == arg5 && arg1 - 1 == arg0 && (field5[arg4][arg0] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (arg5 - 1 == arg4 && arg0 == arg1 && (field5[arg4][arg0] & 0x1280108) == 0) {
					return true;
				}

				if (arg4 == arg5 && arg1 + 1 == arg0 && (field5[arg4][arg0] & 0x1280120) == 0) {
					return true;
				}

				if (arg5 + 1 == arg4 && arg0 == arg1) {
					return true;
				}

				if (arg4 == arg5 && arg1 - 1 == arg0) {
					return true;
				}
			} else if (arg2 == 3) {
				if (arg5 - 1 == arg4 && arg0 == arg1) {
					return true;
				}

				if (arg4 == arg5 && arg1 + 1 == arg0 && (field5[arg4][arg0] & 0x1280120) == 0) {
					return true;
				}

				if (arg5 + 1 == arg4 && arg0 == arg1 && (field5[arg4][arg0] & 0x1280180) == 0) {
					return true;
				}

				if (arg4 == arg5 && arg1 - 1 == arg0) {
					return true;
				}
			}
		}

		if (arg3 == 9) {
			if (arg4 == arg5 && arg1 + 1 == arg0 && (field5[arg4][arg0] & 0x20) == 0) {
				return true;
			}

			if (arg4 == arg5 && arg1 - 1 == arg0 && (field5[arg4][arg0] & 0x2) == 0) {
				return true;
			}

			if (arg5 - 1 == arg4 && arg0 == arg1 && (field5[arg4][arg0] & 0x8) == 0) {
				return true;
			}

			if (arg5 + 1 == arg4 && arg0 == arg1 && (field5[arg4][arg0] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("AOKWRKNA.b(IIIIIII)Z")
	public boolean method11(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg2 && arg1 == arg4) {
			return true;
		}

		arg2 -= field1;
		arg1 -= field2;
		arg0 -= field1;
		arg4 -= field2;
		if (arg5 == 6 || arg5 == 7) {
			if (arg5 == 7) {
				arg3 = arg3 + 2 & 0x3;
			}

			if (arg3 == 0) {
				if (arg0 + 1 == arg2 && arg1 == arg4 && (field5[arg2][arg1] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg4 - 1 == arg1 && (field5[arg2][arg1] & 0x2) == 0) {
					return true;
				}
			} else if (arg3 == 1) {
				if (arg0 - 1 == arg2 && arg1 == arg4 && (field5[arg2][arg1] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg4 - 1 == arg1 && (field5[arg2][arg1] & 0x2) == 0) {
					return true;
				}
			} else if (arg3 == 2) {
				if (arg0 - 1 == arg2 && arg1 == arg4 && (field5[arg2][arg1] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg4 + 1 == arg1 && (field5[arg2][arg1] & 0x20) == 0) {
					return true;
				}
			} else if (arg3 == 3) {
				if (arg0 + 1 == arg2 && arg1 == arg4 && (field5[arg2][arg1] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg4 + 1 == arg1 && (field5[arg2][arg1] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg5 == 8) {
			if (arg0 == arg2 && arg4 + 1 == arg1 && (field5[arg2][arg1] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg2 && arg4 - 1 == arg1 && (field5[arg2][arg1] & 0x2) == 0) {
				return true;
			}

			if (arg0 - 1 == arg2 && arg1 == arg4 && (field5[arg2][arg1] & 0x8) == 0) {
				return true;
			}

			if (arg0 + 1 == arg2 && arg1 == arg4 && (field5[arg2][arg1] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("AOKWRKNA.a(IIBIIIII)Z")
	public boolean method12(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg0 + arg5 - 1;
		int var9 = arg1 + arg3 - 1;
		if (arg6 >= arg5 && arg6 <= var8 && arg4 >= arg1 && arg4 <= var9) {
			return true;
		}

		if (arg5 - 1 == arg6 && arg4 >= arg1 && arg4 <= var9 && (field5[arg6 - field1][arg4 - field2] & 0x8) == 0 && (arg2 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg6 && arg4 >= arg1 && arg4 <= var9 && (field5[arg6 - field1][arg4 - field2] & 0x80) == 0 && (arg2 & 0x2) == 0) {
			return true;
		}

		if (arg1 - 1 == arg4 && arg6 >= arg5 && arg6 <= var8 && (field5[arg6 - field1][arg4 - field2] & 0x2) == 0 && (arg2 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg4 && arg6 >= arg5 && arg6 <= var8 && (field5[arg6 - field1][arg4 - field2] & 0x20) == 0 && (arg2 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
