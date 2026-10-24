package deob;

@ObfuscatedName("YCMSDYIA")
public class YCMSDYIA {

	@ObfuscatedName("YCMSDYIA.f")
	public int field1445 = 0;

	@ObfuscatedName("YCMSDYIA.g")
	public int field1446 = 0;

	@ObfuscatedName("YCMSDYIA.h")
	public int field1447;

	@ObfuscatedName("YCMSDYIA.i")
	public int field1448;

	@ObfuscatedName("YCMSDYIA.j")
	public int[][] field1449;

	public YCMSDYIA(int arg0, int arg1) {
		field1447 = arg0;
		field1448 = arg1;
		field1449 = new int[field1447][field1448];
		method561();
	}

	@ObfuscatedName("YCMSDYIA.a()V")
	public void method561() {
		for (int var1 = 0; var1 < field1447; var1++) {
			for (int var2 = 0; var2 < field1448; var2++) {
				if (var1 == 0 || var2 == 0 || field1447 - 1 == var1 || field1448 - 1 == var2) {
					field1449[var1][var2] = 0xFFFFFF;
				} else {
					field1449[var1][var2] = 0x1000000;
				}
			}
		}
	}

	@ObfuscatedName("YCMSDYIA.a(ZIIIII)V")
	public void method562(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
		arg4 -= field1445;
		arg2 -= field1446;
		if (arg3 == 0) {
			if (arg1 == 0) {
				method565(arg4, arg2, 128);
				method565(arg4 - 1, arg2, 8);
			}

			if (arg1 == 1) {
				method565(arg4, arg2, 2);
				method565(arg4, arg2 + 1, 32);
			}

			if (arg1 == 2) {
				method565(arg4, arg2, 8);
				method565(arg4 + 1, arg2, 128);
			}

			if (arg1 == 3) {
				method565(arg4, arg2, 32);
				method565(arg4, arg2 - 1, 2);
			}
		}

		if (arg3 == 1 || arg3 == 3) {
			if (arg1 == 0) {
				method565(arg4, arg2, 1);
				method565(arg4 - 1, arg2 + 1, 16);
			}

			if (arg1 == 1) {
				method565(arg4, arg2, 4);
				method565(arg4 + 1, arg2 + 1, 64);
			}

			if (arg1 == 2) {
				method565(arg4, arg2, 16);
				method565(arg4 + 1, arg2 - 1, 1);
			}

			if (arg1 == 3) {
				method565(arg4, arg2, 64);
				method565(arg4 - 1, arg2 - 1, 4);
			}
		}

		if (arg3 == 2) {
			if (arg1 == 0) {
				method565(arg4, arg2, 130);
				method565(arg4 - 1, arg2, 8);
				method565(arg4, arg2 + 1, 32);
			}

			if (arg1 == 1) {
				method565(arg4, arg2, 10);
				method565(arg4, arg2 + 1, 32);
				method565(arg4 + 1, arg2, 128);
			}

			if (arg1 == 2) {
				method565(arg4, arg2, 40);
				method565(arg4 + 1, arg2, 128);
				method565(arg4, arg2 - 1, 2);
			}

			if (arg1 == 3) {
				method565(arg4, arg2, 160);
				method565(arg4, arg2 - 1, 2);
				method565(arg4 - 1, arg2, 8);
			}
		}

		if (arg0) {
			if (arg3 == 0) {
				if (arg1 == 0) {
					method565(arg4, arg2, 0x10000);
					method565(arg4 - 1, arg2, 4096);
				}

				if (arg1 == 1) {
					method565(arg4, arg2, 1024);
					method565(arg4, arg2 + 1, 16384);
				}

				if (arg1 == 2) {
					method565(arg4, arg2, 4096);
					method565(arg4 + 1, arg2, 0x10000);
				}

				if (arg1 == 3) {
					method565(arg4, arg2, 16384);
					method565(arg4, arg2 - 1, 1024);
				}
			}

			if (arg3 == 1 || arg3 == 3) {
				if (arg1 == 0) {
					method565(arg4, arg2, 512);
					method565(arg4 - 1, arg2 + 1, 8192);
				}

				if (arg1 == 1) {
					method565(arg4, arg2, 2048);
					method565(arg4 + 1, arg2 + 1, 32768);
				}

				if (arg1 == 2) {
					method565(arg4, arg2, 8192);
					method565(arg4 + 1, arg2 - 1, 512);
				}

				if (arg1 == 3) {
					method565(arg4, arg2, 32768);
					method565(arg4 - 1, arg2 - 1, 2048);
				}
			}

			if (arg3 == 2) {
				if (arg1 == 0) {
					method565(arg4, arg2, 66560);
					method565(arg4 - 1, arg2, 4096);
					method565(arg4, arg2 + 1, 16384);
				}

				if (arg1 == 1) {
					method565(arg4, arg2, 5120);
					method565(arg4, arg2 + 1, 16384);
					method565(arg4 + 1, arg2, 0x10000);
				}

				if (arg1 == 2) {
					method565(arg4, arg2, 20480);
					method565(arg4 + 1, arg2, 0x10000);
					method565(arg4, arg2 - 1, 1024);
				}

				if (arg1 == 3) {
					method565(arg4, arg2, 81920);
					method565(arg4, arg2 - 1, 1024);
					method565(arg4 - 1, arg2, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("YCMSDYIA.a(ZIIIIII)V")
	public void method563(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg0) {
			var7 += 0x20000;
		}

		arg1 -= field1445;
		arg4 -= field1446;

		if (arg2 == 1 || arg2 == 3) {
			int var8 = arg3;
			arg3 = arg5;
			arg5 = var8;
		}

		for (int var9 = arg1; var9 < arg1 + arg3; var9++) {
			if (var9 >= 0 && var9 < field1447) {
				for (int var10 = arg4; var10 < arg4 + arg5; var10++) {
					if (var10 >= 0 && var10 < field1448) {
						method565(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("YCMSDYIA.a(IZI)V")
	public void method564(int arg0, int arg1) {
		arg0 -= field1445;
		arg1 -= field1446;
		field1449[arg0][arg1] |= 0x200000;
	}

	@ObfuscatedName("YCMSDYIA.a(III)V")
	public void method565(int arg0, int arg1, int arg2) {
		field1449[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("YCMSDYIA.b(ZIIIII)V")
	public void method566(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
		arg4 -= field1445;
		arg2 -= field1446;
		if (arg3 == 0) {
			if (arg1 == 0) {
				method568(arg4, 128, arg2);
				method568(arg4 - 1, 8, arg2);
			}

			if (arg1 == 1) {
				method568(arg4, 2, arg2);
				method568(arg4, 32, arg2 + 1);
			}

			if (arg1 == 2) {
				method568(arg4, 8, arg2);
				method568(arg4 + 1, 128, arg2);
			}

			if (arg1 == 3) {
				method568(arg4, 32, arg2);
				method568(arg4, 2, arg2 - 1);
			}
		}

		if (arg3 == 1 || arg3 == 3) {
			if (arg1 == 0) {
				method568(arg4, 1, arg2);
				method568(arg4 - 1, 16, arg2 + 1);
			}

			if (arg1 == 1) {
				method568(arg4, 4, arg2);
				method568(arg4 + 1, 64, arg2 + 1);
			}

			if (arg1 == 2) {
				method568(arg4, 16, arg2);
				method568(arg4 + 1, 1, arg2 - 1);
			}

			if (arg1 == 3) {
				method568(arg4, 64, arg2);
				method568(arg4 - 1, 4, arg2 - 1);
			}
		}

		if (arg3 == 2) {
			if (arg1 == 0) {
				method568(arg4, 130, arg2);
				method568(arg4 - 1, 8, arg2);
				method568(arg4, 32, arg2 + 1);
			}

			if (arg1 == 1) {
				method568(arg4, 10, arg2);
				method568(arg4, 32, arg2 + 1);
				method568(arg4 + 1, 128, arg2);
			}

			if (arg1 == 2) {
				method568(arg4, 40, arg2);
				method568(arg4 + 1, 128, arg2);
				method568(arg4, 2, arg2 - 1);
			}

			if (arg1 == 3) {
				method568(arg4, 160, arg2);
				method568(arg4, 2, arg2 - 1);
				method568(arg4 - 1, 8, arg2);
			}
		}

		if (arg0) {
			if (arg3 == 0) {
				if (arg1 == 0) {
					method568(arg4, 0x10000, arg2);
					method568(arg4 - 1, 4096, arg2);
				}

				if (arg1 == 1) {
					method568(arg4, 1024, arg2);
					method568(arg4, 16384, arg2 + 1);
				}

				if (arg1 == 2) {
					method568(arg4, 4096, arg2);
					method568(arg4 + 1, 0x10000, arg2);
				}

				if (arg1 == 3) {
					method568(arg4, 16384, arg2);
					method568(arg4, 1024, arg2 - 1);
				}
			}

			if (arg3 == 1 || arg3 == 3) {
				if (arg1 == 0) {
					method568(arg4, 512, arg2);
					method568(arg4 - 1, 8192, arg2 + 1);
				}

				if (arg1 == 1) {
					method568(arg4, 2048, arg2);
					method568(arg4 + 1, 32768, arg2 + 1);
				}

				if (arg1 == 2) {
					method568(arg4, 8192, arg2);
					method568(arg4 + 1, 512, arg2 - 1);
				}

				if (arg1 == 3) {
					method568(arg4, 32768, arg2);
					method568(arg4 - 1, 2048, arg2 - 1);
				}
			}

			if (arg3 == 2) {
				if (arg1 == 0) {
					method568(arg4, 66560, arg2);
					method568(arg4 - 1, 4096, arg2);
					method568(arg4, 16384, arg2 + 1);
				}

				if (arg1 == 1) {
					method568(arg4, 5120, arg2);
					method568(arg4, 16384, arg2 + 1);
					method568(arg4 + 1, 0x10000, arg2);
				}

				if (arg1 == 2) {
					method568(arg4, 20480, arg2);
					method568(arg4 + 1, 0x10000, arg2);
					method568(arg4, 1024, arg2 - 1);
				}

				if (arg1 == 3) {
					method568(arg4, 81920, arg2);
					method568(arg4, 1024, arg2 - 1);
					method568(arg4 - 1, 4096, arg2);
					return;
				}
			}
		}
	}

	@ObfuscatedName("YCMSDYIA.a(IZIIIIZ)V")
	public void method567(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg1) {
			var7 += 0x20000;
		}

		arg2 -= field1445;
		arg5 -= field1446;

		if (arg3 == 1 || arg3 == 3) {
			int var8 = arg0;
			arg0 = arg4;
			arg4 = var8;
		}

		for (int var9 = arg2; var9 < arg0 + arg2; var9++) {
			if (var9 >= 0 && var9 < field1447) {
				for (int var10 = arg5; var10 < arg4 + arg5; var10++) {
					if (var10 >= 0 && var10 < field1448) {
						method568(var9, var7, var10);
					}
				}
			}
		}
	}

	@ObfuscatedName("YCMSDYIA.a(IBII)V")
	public void method568(int arg0, int arg1, int arg2) {
		field1449[arg0][arg2] &= 0xFFFFFF - arg1;
	}

	@ObfuscatedName("YCMSDYIA.b(III)V")
	public void method569(int arg0, int arg1) {
		arg1 -= field1445;
		arg0 -= field1446;
		field1449[arg1][arg0] &= 0xDFFFFF;
	}

	@ObfuscatedName("YCMSDYIA.a(IIIZIII)Z")
	public boolean method570(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg3 == arg4 && arg0 == arg2) {
			return true;
		}

		arg3 -= field1445;
		arg0 -= field1446;
		arg4 -= field1445;
		arg2 -= field1446;
		if (arg1 == 0) {
			if (arg5 == 0) {
				if (arg4 - 1 == arg3 && arg0 == arg2) {
					return true;
				}

				if (arg3 == arg4 && arg2 + 1 == arg0 && (field1449[arg3][arg0] & 0x1280120) == 0) {
					return true;
				}

				if (arg3 == arg4 && arg2 - 1 == arg0 && (field1449[arg3][arg0] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (arg3 == arg4 && arg2 + 1 == arg0) {
					return true;
				}

				if (arg4 - 1 == arg3 && arg0 == arg2 && (field1449[arg3][arg0] & 0x1280108) == 0) {
					return true;
				}

				if (arg4 + 1 == arg3 && arg0 == arg2 && (field1449[arg3][arg0] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (arg4 + 1 == arg3 && arg0 == arg2) {
					return true;
				}

				if (arg3 == arg4 && arg2 + 1 == arg0 && (field1449[arg3][arg0] & 0x1280120) == 0) {
					return true;
				}

				if (arg3 == arg4 && arg2 - 1 == arg0 && (field1449[arg3][arg0] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg5 == 3) {
				if (arg3 == arg4 && arg2 - 1 == arg0) {
					return true;
				}

				if (arg4 - 1 == arg3 && arg0 == arg2 && (field1449[arg3][arg0] & 0x1280108) == 0) {
					return true;
				}

				if (arg4 + 1 == arg3 && arg0 == arg2 && (field1449[arg3][arg0] & 0x1280180) == 0) {
					return true;
				}
			}
		}

		if (arg1 == 2) {
			if (arg5 == 0) {
				if (arg4 - 1 == arg3 && arg0 == arg2) {
					return true;
				}

				if (arg3 == arg4 && arg2 + 1 == arg0) {
					return true;
				}

				if (arg4 + 1 == arg3 && arg0 == arg2 && (field1449[arg3][arg0] & 0x1280180) == 0) {
					return true;
				}

				if (arg3 == arg4 && arg2 - 1 == arg0 && (field1449[arg3][arg0] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (arg4 - 1 == arg3 && arg0 == arg2 && (field1449[arg3][arg0] & 0x1280108) == 0) {
					return true;
				}

				if (arg3 == arg4 && arg2 + 1 == arg0) {
					return true;
				}

				if (arg4 + 1 == arg3 && arg0 == arg2) {
					return true;
				}

				if (arg3 == arg4 && arg2 - 1 == arg0 && (field1449[arg3][arg0] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (arg4 - 1 == arg3 && arg0 == arg2 && (field1449[arg3][arg0] & 0x1280108) == 0) {
					return true;
				}

				if (arg3 == arg4 && arg2 + 1 == arg0 && (field1449[arg3][arg0] & 0x1280120) == 0) {
					return true;
				}

				if (arg4 + 1 == arg3 && arg0 == arg2) {
					return true;
				}

				if (arg3 == arg4 && arg2 - 1 == arg0) {
					return true;
				}
			} else if (arg5 == 3) {
				if (arg4 - 1 == arg3 && arg0 == arg2) {
					return true;
				}

				if (arg3 == arg4 && arg2 + 1 == arg0 && (field1449[arg3][arg0] & 0x1280120) == 0) {
					return true;
				}

				if (arg4 + 1 == arg3 && arg0 == arg2 && (field1449[arg3][arg0] & 0x1280180) == 0) {
					return true;
				}

				if (arg3 == arg4 && arg2 - 1 == arg0) {
					return true;
				}
			}
		}

		if (arg1 == 9) {
			if (arg3 == arg4 && arg2 + 1 == arg0 && (field1449[arg3][arg0] & 0x20) == 0) {
				return true;
			}

			if (arg3 == arg4 && arg2 - 1 == arg0 && (field1449[arg3][arg0] & 0x2) == 0) {
				return true;
			}

			if (arg4 - 1 == arg3 && arg0 == arg2 && (field1449[arg3][arg0] & 0x8) == 0) {
				return true;
			}

			if (arg4 + 1 == arg3 && arg0 == arg2 && (field1449[arg3][arg0] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("YCMSDYIA.a(IIIIIII)Z")
	public boolean method571(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg2 && arg3 == arg5) {
			return true;
		}

		arg0 -= field1445;
		arg5 -= field1446;
		arg2 -= field1445;
		arg3 -= field1446;
		if (arg1 == 6 || arg1 == 7) {
			if (arg1 == 7) {
				arg4 = arg4 + 2 & 0x3;
			}

			if (arg4 == 0) {
				if (arg2 + 1 == arg0 && arg3 == arg5 && (field1449[arg0][arg5] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg3 - 1 == arg5 && (field1449[arg0][arg5] & 0x2) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (arg2 - 1 == arg0 && arg3 == arg5 && (field1449[arg0][arg5] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg3 - 1 == arg5 && (field1449[arg0][arg5] & 0x2) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (arg2 - 1 == arg0 && arg3 == arg5 && (field1449[arg0][arg5] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg3 + 1 == arg5 && (field1449[arg0][arg5] & 0x20) == 0) {
					return true;
				}
			} else if (arg4 == 3) {
				if (arg2 + 1 == arg0 && arg3 == arg5 && (field1449[arg0][arg5] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg3 + 1 == arg5 && (field1449[arg0][arg5] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg1 == 8) {
			if (arg0 == arg2 && arg3 + 1 == arg5 && (field1449[arg0][arg5] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg2 && arg3 - 1 == arg5 && (field1449[arg0][arg5] & 0x2) == 0) {
				return true;
			}

			if (arg2 - 1 == arg0 && arg3 == arg5 && (field1449[arg0][arg5] & 0x8) == 0) {
				return true;
			}

			if (arg2 + 1 == arg0 && arg3 == arg5 && (field1449[arg0][arg5] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("YCMSDYIA.a(IIZIIIII)Z")
	public boolean method572(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg0 + arg2 - 1;
		int var9 = arg3 + arg6 - 1;
		if (arg4 >= arg2 && arg4 <= var8 && arg1 >= arg6 && arg1 <= var9) {
			return true;
		}

		if (arg2 - 1 == arg4 && arg1 >= arg6 && arg1 <= var9 && (field1449[arg4 - field1445][arg1 - field1446] & 0x8) == 0 && (arg5 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg4 && arg1 >= arg6 && arg1 <= var9 && (field1449[arg4 - field1445][arg1 - field1446] & 0x80) == 0 && (arg5 & 0x2) == 0) {
			return true;
		}

		if (arg6 - 1 == arg1 && arg4 >= arg2 && arg4 <= var8 && (field1449[arg4 - field1445][arg1 - field1446] & 0x2) == 0 && (arg5 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg1 && arg4 >= arg2 && arg4 <= var8 && (field1449[arg4 - field1445][arg1 - field1446] & 0x20) == 0 && (arg5 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
